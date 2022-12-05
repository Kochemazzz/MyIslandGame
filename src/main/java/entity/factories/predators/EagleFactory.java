package entity.factories.predators;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.predators.Eagle;
public class EagleFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Eagle();
    }
}
