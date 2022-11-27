package entity.factories;
import entity.Animated;
import entity.predators.Wolf;
public class WolfFactory implements PredatorsFactory {
    @Override
    public Animated createAnimated() {
        return new Wolf();
    }
}
