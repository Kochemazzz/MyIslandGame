package entity.factories.herbivore;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.herbivore.Plants;
public class PlantsFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Plants();
    }
}
