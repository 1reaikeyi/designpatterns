package 结构型.装饰模式;

public class EggPan extends Pan{
    public EggPan() {
    }

    @Override
    public String name() {
        return "煎饼+1个蛋";
    }

    @Override
    public int price() {
        return super.price() + 1;
    }
}
