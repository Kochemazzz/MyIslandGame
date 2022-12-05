package entity.factories.predators;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.predators.Boar;

public class BoarFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Boar();
    }
}
