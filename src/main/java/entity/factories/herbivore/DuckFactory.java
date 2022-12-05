package entity.factories.herbivore;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.herbivore.Duck;
public class DuckFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Duck();
    }
}
