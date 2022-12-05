package entity.factories.predators;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.predators.Bear;
public class BearFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Bear();
    }
}
