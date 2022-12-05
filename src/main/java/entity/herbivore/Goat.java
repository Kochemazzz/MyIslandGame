package entity.herbivore;
import entity.Animated;

import java.util.Map;
public class Goat extends Animated {
    private final String ANIMAL = "Коза";
    private final double WEIGHT;
    private final double SPEED;
    private final double MAX_COUNT_IN_CELL;
    private final double COUNT_FOOD;
    private Map<String, Double> MAP_PROBABILITY;
    public Goat() {
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
        return this.ANIMAL;
    }
    @Override
    public double getWEIGHT() {
        return this.WEIGHT;
    }
    @Override
    public double getSPEED() {
        return this.SPEED;
    }
    @Override
    public double getMAX_COUNT_IN_CELL() {
        return this.MAX_COUNT_IN_CELL;
    }
    @Override
    public double getCOUNT_FOOD() {
        return this.COUNT_FOOD;
    }
    public Map<String, Double> getMAP_PROBABILITY() {
        return MAP_PROBABILITY;
    }
}
