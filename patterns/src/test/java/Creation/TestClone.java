package Creation;

import org.junit.Test;
import 创建型.原型模式.Actor;
import 创建型.原型模式.ActorDeep;

public class TestClone {
    @Test
    public void test() {
        ActorDeep actor1 = new ActorDeep();
        actor1.setName("熊大");
        actor1.setHobby(" 打游戏");
        System.out.println("actor1 = " + actor1);
        ActorDeep actor2 = new ActorDeep();
        actor2.setName("熊二");
        actor2.setHobby(" 打游戏");
        System.out.println("actor2 = " + actor2);
        ActorDeep actor3 = new ActorDeep();
        actor3.setName("熊三");
        actor3.setHobby(" 打游戏");
        System.out.println("actor3 = " + actor3);
    }
    @Test
    public void testClone() throws CloneNotSupportedException {
        Actor actor1 = new Actor();
        actor1.setName("熊大");
        actor1.setHobby(" 打游戏");
        actor1.homeWork = new String[]{"a","b","c"};
        System.out.println(actor1.getName()+"\t"+actor1.getHobby());
        System.out.println("actor1 = " + actor1);
            Actor actor2 = actor1.clone();
            actor2.setName("熊二");
            actor2.setHobby(" 打游戏");
        System.out.println(actor2.getName()+"\t"+actor2.getHobby());
            System.out.println("actor2 = " + actor2);
            Actor actor3 = actor1.clone();
//            Actor actor3 = actor2.clone();
        System.out.println(actor3.getName()+"\t"+actor3.getHobby());
            System.out.println("actor3 = " + actor3);
        System.out.println(actor1.homeWork == actor1.homeWork);//true
        System.out.println(actor2.homeWork == actor3.homeWork);//true
        System.out.println(actor1.homeWork == actor3.homeWork);//true
    }
    @Test
    public void testClone2() throws CloneNotSupportedException {
        ActorDeep actor1 = new ActorDeep();
        actor1.setName("熊大");
        actor1.setHobby("打游戏");
        actor1.teacher = "王老师";
        actor1.homeWork = new String[]{"a","b","c"};
        System.out.println("actor1 = " + actor1);
        ActorDeep actor2 = actor1.clone();
        System.out.println("actor2 = " + actor2);
        System.out.println(actor1.teacher == actor2.teacher);//false
    }
}
