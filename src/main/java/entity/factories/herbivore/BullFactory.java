package entity.factories.herbivore;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.herbivore.Bull;
public class BullFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Bull();
    }
}
