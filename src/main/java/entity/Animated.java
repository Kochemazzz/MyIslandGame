package entity;
public abstract class Animated implements Animal {
    @Override
    abstract public void go();
    @Override
    abstract public void eat();
    @Override
    abstract public void multiply();
    @Override
    abstract public void die();
    abstract public String getANIMAL();
    abstract public double getWEIGHT();
    abstract public double getSPEED();
    abstract public double getMAX_COUNT_IN_CELL();
    abstract public double getCOUNT_FOOD();
}
