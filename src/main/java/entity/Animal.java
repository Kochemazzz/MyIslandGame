package entity;
import java.util.List;
import java.util.Map;

import static files.GetData.MAP_CHARACTERISTIC;
import static files.GetData.MAP_PROBABILITY;
public interface Animal {
    void go(); //передвигаться (в соседние локации)
    void eat(); //есть растения и/или других животных (если в их локации есть подходящая еда)
    void multiply();//размножаться (при наличии пары в их локации
    void die();//умирать от голода или быть съеденными
    default List<Double> getValuesAnimal(String animal){
        List<Double> animalInList = MAP_CHARACTERISTIC.get(animal);
        return animalInList;
    };
    default Map<String, Double> getProbabilityAnimal(String animal){
        Map<String, Double> animalToAnimalProbability = MAP_PROBABILITY.get(animal);
        return animalToAnimalProbability;
     };
}
