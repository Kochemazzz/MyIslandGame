package entity.factories.herbivore;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.herbivore.Caterpillar;
import entity.herbivore.Sheep;
public class CaterpillarFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Caterpillar();
    }
}
