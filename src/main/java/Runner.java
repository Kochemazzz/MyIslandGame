import Files.GetData;
import entity.*;
import entity.factories.PredatorsFactory;
import entity.factories.WolfFactory;
public class Runner {
    public static void main(String[] args) {



        GameMap gameMap = GameMap.getMap(11, 12);
        System.out.println(gameMap.getGameMap().length);
        GetData getData = new GetData();
        System.out.println(getData.GetFileCharacteristics());
        System.out.println(getData.GetFileProbability());
        PredatorsFactory predatorsFactory = new WolfFactory();
        Animated animated = predatorsFactory.createAnimated();
        System.out.println(animated.getCOUNT_FOOD());


//        Wolf predator = new Wolf();
//        System.out.println(predator.getWEIGHT());
//        System.out.println(predator.getMAX_COUNT_IN_CELL());
//        System.out.println(predator.getSPEED());
//        System.out.println(predator.getCOUNT_FOOD());



    }
}
