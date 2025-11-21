package 结构型.装饰模式;

public class EggPan extends PanDecorator{
    public EggPan(Food decorated) {
        super(decorated);
    }

    // 在被装饰对象的名称后添加“+1个蛋”
    @Override
    public String name() {
        return super.name() + "+1个蛋";
    }

    // 在被装饰对象的价格基础上加1元
    @Override
    public int price() {
        return super.price() + 1;
    }
}
