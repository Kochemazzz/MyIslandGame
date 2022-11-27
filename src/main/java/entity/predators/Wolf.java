package entity.predators;



import entity.Animal;
import entity.Animated;

import java.util.List;

import static Files.GetData.MAP_CHARACTERISTIC;
public class Wolf  extends Animated implements Animal {
    private final String ANIMAL = "Волк";
    private final double WEIGHT;
    private final double SPEED;
    private final double MAX_COUNT_IN_CELL;
    private final double COUNT_FOOD;
    public Wolf() {

        this.WEIGHT = getValuesAnimal(ANIMAL).get(0);
        this.MAX_COUNT_IN_CELL = getValuesAnimal(ANIMAL).get(1);
        this.SPEED = getValuesAnimal(ANIMAL).get(2);
        this.COUNT_FOOD = getValuesAnimal(ANIMAL).get(3);
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
        return null;
    }
    @Override
    public List<Double> getValuesAnimal(String animal) {
        List<Double> animalInList = MAP_CHARACTERISTIC.get(animal);
        return animalInList;
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
}
