package 建造者模式;

public class Car {
    private String engine;
    private String color;
    private String name;

    @Override
    public String toString() {
        return "汽车信息：{" +
                "发动机='" + engine + '\'' +
                ", 颜色='" + color + '\'' +
                ", 名称='" + name + '\'' +
                '}';
    }

    public Car() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
