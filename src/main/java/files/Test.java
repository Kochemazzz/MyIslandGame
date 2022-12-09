package files;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class Test {
    public static String KEY_MAP;
    public static List<String> KEYS = new ArrayList<>();
    public static Map<String, Double> VALUE_MAP = new HashMap<>();
    public static Map<String, Map<String, Double>> data = new HashMap<>();
    public static void main(String[] args) {
        GetFileProbability();
    }
    public static Map<String, Map<String, Double>> GetFileProbability() {
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
                    PUT_MAP.putAll(VALUE_MAP);
                    if (PUT_MAP.isEmpty()) {
                    } else {
                        data.put(KEY_MAP, PUT_MAP);
                    }
                    if (cell.getColumnIndex() == 0) {
                        KEY_MAP = String.valueOf(cell);
                        VALUE_MAP.clear();
                    } else {
                        VALUE_MAP.put(KEYS.get(cell.getColumnIndex() - 1), Double.valueOf(String.valueOf(cell)));
                    }
                }
            }
        }
        System.out.println(data);
        return data;
    }
}
