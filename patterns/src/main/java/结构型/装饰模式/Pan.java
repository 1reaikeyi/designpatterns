package 结构型.装饰模式;

public abstract class Pan extends Food {
    private Food food;
    public Pan() {

    }
    public Pan(Food food) {
        this.food = food;
    }
    @Override
    public String name() {
        return "煎饼";
    }
    @Override
    public int price() {
        return 5;
    }
}
