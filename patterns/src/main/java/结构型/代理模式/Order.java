package 结构型.代理模式;

public class Order implements OrderDao{
    @Override
    public void saveOrder() {
        System.out.println("正在保存订单");
    }
}
