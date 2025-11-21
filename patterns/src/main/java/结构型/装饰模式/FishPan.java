package 结构型.装饰模式;

public class FishPan extends PanDecorator{
    public FishPan(Food decorated) {
        super(decorated);
    }
    @Override
    public String name() {
        return super.name()+"小黄鱼";
    }

    @Override
    public int price() {
        return super.price()+2;
    }
}
