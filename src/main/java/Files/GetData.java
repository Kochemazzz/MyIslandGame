package Files;
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
    public static List<Double> VALUE_MAP = new ArrayList<>();
    public static Map<String,List<Double>> MAP_CHARACTERISTIC = new HashMap<>();
    public static Map<String,List<Double>> MAP_PROBABILITY = new HashMap<>();
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
            KEY_MAP = null;
            MAP_CHARACTERISTIC = data;
        }
        return data;
    }
    @Override
    public Map<String, List<Double>> GetFileProbability() {
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
        Sheet sheet = workbook.getSheetAt(0);
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
            MAP_PROBABILITY = data;
        }
        return data;
    }
}
