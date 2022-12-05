package files;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GetData implements ImportFile {
    public static String KEY_MAP;
    public static List<String> KEYS = new ArrayList<>();
    public static List<Double> VALUE_MAP = new ArrayList<>();
    public static Map<String, Double> VALUE_MAP_PROB = new HashMap<>();
    public static Map<String, List<Double>> MAP_CHARACTERISTIC = new HashMap<>();
    public static Map<String, Map<String, Double>> MAP_PROBABILITY = new HashMap<>();
    public static Map<String, String> MAP_ICONS = new HashMap();
    @Override
    public Map<String, List<Double>> GetFileCharacteristics() {
        Map<String, List<Double>> data = new HashMap<>();
        FileInputStream file = null;
        try {
            file = new FileInputStream("book.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Workbook workbook = null;
        try {
            assert file != null;
            workbook = new HSSFWorkbook(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert workbook != null;
        Sheet sheet = workbook.getSheetAt(1);
        boolean flag = true;
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (flag) {
                    KEY_MAP = String.valueOf(cell);
                    flag = false;
                } else {
                    VALUE_MAP.add(Double.valueOf(String.valueOf(cell)));
                }
            }
            data.put(KEY_MAP, VALUE_MAP);
            flag = true;
            VALUE_MAP = new ArrayList<>();
            MAP_CHARACTERISTIC = data;
        }
        System.out.println("Характеристики для всех животных получены");
        return data;
    }
    @Override
    public Map<String, Map<String, Double>> GetFileProbability() {
        Map<String, Map<String, Double>> data = new HashMap<>();
        FileInputStream file = null;
        try {
            file = new FileInputStream("book.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Workbook workbook = null;
        try {
            assert file != null;
            workbook = new HSSFWorkbook(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert workbook != null;
        Sheet sheet = workbook.getSheetAt(0);
        boolean flag = true;
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (row.getRowNum() == 0) {
                    KEYS.add(String.valueOf(cell));
                } else {
                    Map<String, Double> PUT_MAP = new HashMap<>();
                    PUT_MAP.putAll(VALUE_MAP_PROB);
                    if (PUT_MAP.isEmpty()) {
                    } else {
                        data.put(KEY_MAP, PUT_MAP);
                    }
                    if (cell.getColumnIndex() == 0) {
                        KEY_MAP = String.valueOf(cell);
                        VALUE_MAP_PROB.clear();
                    } else {
                        VALUE_MAP_PROB.put(KEYS.get(cell.getColumnIndex() - 1), Double.valueOf(String.valueOf(cell)));
                    }
                }
            }
        }
        VALUE_MAP.clear();
        KEY_MAP = null;
        KEYS.clear();
        MAP_PROBABILITY = data;
        System.out.println("Вероятности для всех животных получены");
        return MAP_PROBABILITY;
    }
    @Override
    public Map<String, String> GetFileIcons() {
        FileInputStream file = null;
        try {
            file = new FileInputStream("book.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Workbook workbook = null;
        try {
            assert file != null;
            workbook = new HSSFWorkbook(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert workbook != null;
        Sheet sheet = workbook.getSheetAt(2);
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getColumnIndex() == 0){
                    KEY_MAP = String.valueOf(cell);
                }
                else{
                    String character = (String.valueOf(cell));
                    if(KEY_MAP == null || character == null){
                        break;
                    }
                    MAP_ICONS.put(KEY_MAP,character);
                    System.out.println(MAP_ICONS);

                }

            }
        }
        return MAP_ICONS;
    }
}