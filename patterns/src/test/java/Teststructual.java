import org.junit.Test;

import 结构型.代理模式.DynamicProxy;
import 结构型.代理模式.Order;
import 结构型.代理模式.OrderDao;
import 结构型.代理模式.StaticProxy;
import 结构型.外观模式.Food;
import 结构型.外观模式.Resturant;
import 结构型.桥接模式.Circle;
import 结构型.桥接模式.Pen;
import 结构型.桥接模式.Tool;
import 结构型.类适配器.Mediafactory;
import 结构型.组合模式.Emoploree;

public class Teststructual {
    @Test
    public void test类适配器() {
        Mediafactory mf = new Mediafactory();
        mf.play("view","video.view");
        mf.play("mp3","aaa");
        mf.play("mp4","mp4.mp4");
    }
    @Test
    public void test聚合(){
        Emoploree management = new Emoploree("李华","总理","管理部");
        Emoploree managementer1 = new Emoploree("小明","经理1","管理部");
        Emoploree managementer2 = new Emoploree("小红","经理2","管理部");
        Emoploree emo1 = new Emoploree("Tom","worker","管理部");
        Emoploree emo2 = new Emoploree("Jenry","worker","管理部");
        management.add(managementer1);
        management.add(managementer2);
        managementer1.add(emo1);
        managementer1.add(emo2);
        managementer2.add(emo1);
        managementer2.add(emo2);
        for (Emoploree emoploree : management.getEmoplorees()) {
            System.out.println(management.getName()+" "+management.getJob()+" "+management.getDepartment());
            System.out.println(emoploree.getName()+" "+emoploree.getJob()+" "+emoploree.getDepartment());
            for (Emoploree staff : emoploree.getEmoplorees()) {
                System.out.println(staff.getName()+" "+staff.getJob()+" "+staff.getDepartment());
            }
        }

    }
    @Test
    public void test桥接() {
        Tool tool = new Pen(new Circle());
        tool.use();
    }

    @Test
    public void test外观() {
            Food food = new Food("汉堡");
            Resturant resturant = new Resturant();
            resturant.buy(food);

    }
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
