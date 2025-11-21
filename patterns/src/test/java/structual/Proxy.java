package structual;

import org.junit.Test;
import 结构型.代理模式.DynamicProxy;
import 结构型.代理模式.Order;
import 结构型.代理模式.OrderDao;
import 结构型.代理模式.StaticProxy;

public class Proxy {
    @Test
    public void test代理static() {
        StaticProxy xy = new StaticProxy();
        xy.xy();
    }
    @Test
    public void test代理() {
        // 创建目标对象
        OrderDao order = new Order();

        // 创建动态代理
        DynamicProxy xy = new DynamicProxy(order);
        OrderDao proxy = (OrderDao) xy.getProxy();

        // 通过代理调用方法
        proxy.saveOrder(); // 输出：开启事务 → 正在保存订单 → 关闭事务

    }
}
