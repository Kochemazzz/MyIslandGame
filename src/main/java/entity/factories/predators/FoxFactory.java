package entity.factories.predators;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.predators.Fox;
public class FoxFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Fox();
    }
}
