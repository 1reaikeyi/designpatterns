package 建造者模式;

public class BuildFactory extends Build{
    @Override
    public void getEngine() {
        car.setEngine("V8发动机");
    }

    @Override
    public void getColor() {
        car.setColor("红色");
    }

    @Override
    public void getName() {
        car.setName("宝马X5");
    }
}
