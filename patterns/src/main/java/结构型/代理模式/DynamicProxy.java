package 结构型.代理模式;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements java.lang.reflect.InvocationHandler{
    public Object order;
    public DynamicProxy(Object order) {
        this.order = order;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(order.getClass().getClassLoader(),order.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启事务");
        Object invoke = method.invoke(order, args);
        System.out.println("关闭事务");
        return invoke;
    }
}
