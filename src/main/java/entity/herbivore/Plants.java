package entity.herbivore;
import entity.Animated;
public class Plants extends Animated {
    private final String ANIMAL = "Растения";
    private final double WEIGHT;
    private final double SPEED;
    private final double MAX_COUNT_IN_CELL;
    private final double COUNT_FOOD;
    public Plants() {
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
    public double getWEIGHT() {
        return 0;
    }
    @Override
    public double getSPEED() {
        return 0;
    }
    @Override
    public double getMAX_COUNT_IN_CELL() {
        return 0;
    }
    @Override
    public double getCOUNT_FOOD() {
        return 0;
    }
    public void growPlant(){
        System.out.println("Растение растет");
    }
    public void diePlant(){
        System.out.println("Растение погибает");
    }


}
