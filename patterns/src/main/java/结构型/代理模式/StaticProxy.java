package 结构型.代理模式;

public class StaticProxy {
    private OrderDao orderDao;
    public void xy(){
        orderDao = new Order();
        System.out.println("开启事务");
        orderDao.saveOrder();
        System.out.println("关闭事务");
    }
}
