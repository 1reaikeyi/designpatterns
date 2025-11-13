package 建造者模式;

public abstract class Build {
    public Car car = new Car();
    public abstract void getEngine();
    public abstract void getColor();
    public abstract void getName();
    public Car getCar() {
        return car;
    }
}
