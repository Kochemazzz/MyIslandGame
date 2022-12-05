package entity.factories.predators;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.predators.Snake;

public class SnakeFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Snake();
    }
}
