package files;
import java.util.List;
import java.util.Map;
public interface ImportFile {
    Map<String, List<Double>> GetFileCharacteristics();
    Map<String, Map<String, Double>> GetFileProbability();
    Map<String, String> GetFileIcons();

}
