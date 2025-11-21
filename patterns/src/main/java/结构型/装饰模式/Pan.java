package 结构型.装饰模式;

public class Pan extends Food{
    @Override
    public String name() {
        return "煎饼"; // 基础名称
    }

    @Override
    public int price() {
        return 5; // 基础价格
    }
}
