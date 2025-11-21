package 结构型.外观模式;

public class Eat {
    private String name;

    public Eat(String name) {
        this.name = name;
    }

    public Eat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
