import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.factories.predators.BearFactory;
import entity.predators.Wolf;
import files.GetData;

import java.util.Map;
public class Runner {
    public static void main(String[] args) {

        GetData getData = new GetData();
        System.out.println(getData.GetFileProbability());
        System.out.println(getData.GetFileCharacteristics());
        System.out.println(getData.GetFileIcons());
//        AnimalsFactory animalsFactory = new BearFactory();
//        Animated animal = animalsFactory.createAnimal();
//        System.out.println(animal.getCOUNT_FOOD());





//        Map<String, Map<String, Double>> stringMapMap = getData.GetFileProbability();
//        System.out.println(stringMapMap);
//        Wolf wolf = new Wolf();
//        System.out.println(wolf.getMAP_PROBABILITY());



//        Wolf predator = new Wolf();
//        System.out.println(predator.getWEIGHT());
//        System.out.println(predator.getMAX_COUNT_IN_CELL());
//        System.out.println(predator.getSPEED());
//        System.out.println(predator.getCOUNT_FOOD());



    }
}
