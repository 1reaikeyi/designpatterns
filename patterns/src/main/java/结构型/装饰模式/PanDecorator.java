package 结构型.装饰模式;

public abstract class PanDecorator extends Food{
    private Food food;
    // 构造方法传入被装饰的对象
    public PanDecorator(Food decoratedFood) {
        this.food = decoratedFood;
    }

    // 委托被装饰对象的name方法
    @Override
    public String name() {
        return food.name();
    }

    // 委托被装饰对象的price方法
    @Override
    public int price() {
        return food.price();
    }
}
