package entity.herbivore;
import entity.Animal;
import entity.Animated;

import java.util.Map;
public class Deer extends Animated implements Animal {
    private final String ANIMAL = "Олень";
    private final double WEIGHT;
    private final double SPEED;
    private final double MAX_COUNT_IN_CELL;
    private final double COUNT_FOOD;
    private Map<String, Double> MAP_PROBABILITY;
    public Deer() {
        this.WEIGHT = getValuesAnimal(ANIMAL).get(0);
        this.MAX_COUNT_IN_CELL = getValuesAnimal(ANIMAL).get(1);
        this.SPEED = getValuesAnimal(ANIMAL).get(2);
        this.COUNT_FOOD = getValuesAnimal(ANIMAL).get(3);
        this.MAP_PROBABILITY = getProbabilityAnimal(ANIMAL);
    }
    @Override
    public void go() {
    }
    @Override
    public void eat() {
    }
    @Override
    public void multiply() {
    }
    @Override
    public void die() {
    }
    public String getANIMAL() {
        return ANIMAL;
    }
    public double getWEIGHT() {
        return WEIGHT;
    }
    public double getSPEED() {
        return SPEED;
    }
    public double getMAX_COUNT_IN_CELL() {
        return MAX_COUNT_IN_CELL;
    }
    public double getCOUNT_FOOD() {
        return COUNT_FOOD;
    }
    public Map<String, Double> getMAP_PROBABILITY() {
        return MAP_PROBABILITY;
    }
}
