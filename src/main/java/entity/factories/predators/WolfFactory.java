package entity.factories.predators;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.predators.Wolf;
public class WolfFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Wolf();
    }
}
