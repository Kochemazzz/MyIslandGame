package Files;
import java.util.List;
import java.util.Map;
public interface ImportFile {
    Map<String, List<Double>> GetFileCharacteristics();
    Map<String, List<Double>> GetFileProbability();

}
