package entity.factories.herbivore;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.herbivore.Goat;
public class GoatFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Goat();
    }
}
