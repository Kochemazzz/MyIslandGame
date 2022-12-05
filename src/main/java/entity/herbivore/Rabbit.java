package entity.herbivore;
import entity.Animal;
import entity.Animated;

import java.util.Map;
public class Rabbit extends Animated implements Animal {
    private final String ANIMAL = "Кролик";
    private final double WEIGHT;
    private final double SPEED;
    private final double MAX_COUNT_IN_CELL;
    private final double COUNT_FOOD;
    private Map<String, Double> MAP_PROBABILITY;
    public Rabbit() {
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
    @Override
    public String getANIMAL() {
        return ANIMAL;
    }
    @Override
    public double getWEIGHT() {
        return WEIGHT;
    }
    @Override
    public double getSPEED() {
        return SPEED;
    }
    @Override
    public double getMAX_COUNT_IN_CELL() {
        return MAX_COUNT_IN_CELL;
    }
    @Override
    public double getCOUNT_FOOD() {
        return COUNT_FOOD;
    }
    public Map<String, Double> getMAP_PROBABILITY() {
        return MAP_PROBABILITY;
    }
}
