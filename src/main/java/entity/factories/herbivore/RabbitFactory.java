package entity.factories.herbivore;
import entity.Animated;
import entity.factories.AnimalsFactory;
import entity.herbivore.Rabbit;
public class RabbitFactory implements AnimalsFactory {
    @Override
    public Animated createAnimal() {
        return new Rabbit();
    }
}
