package 创建型.建造者模式;

public class Enginer {
    private Build build;

    public Enginer() {
    }

    public Enginer(Build build) {
        this.build = build;
    }

    public Car create() {
        build.getEngine();
        build.getColor();
        build.getName();
        return build.getCar();
    }
}
