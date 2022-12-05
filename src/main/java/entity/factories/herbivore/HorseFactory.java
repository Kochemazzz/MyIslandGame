package entity.factories.herbivore;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.herbivore.Goat;
import entity.herbivore.Horse;
public class HorseFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Horse();
    }
}
