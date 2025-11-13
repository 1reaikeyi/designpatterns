import org.junit.Test;
import 原型模式.Actor;

public class TestClone {
    @Test
    public void test() {
        Actor actor1 = new Actor();
        actor1.setName("熊大");
        actor1.setHobby(" 打游戏");
        System.out.println("actor1 = " + actor1);
        Actor actor2 = new Actor();
        actor2.setName("熊二");
        actor2.setHobby(" 打游戏");
        System.out.println("actor2 = " + actor2);
        Actor actor3 = new Actor();
        actor3.setName("熊三");
        actor3.setHobby(" 打游戏");
        System.out.println("actor3 = " + actor3);
    }
    @Test
    public void testClone() throws CloneNotSupportedException {
        Actor actor1 = new Actor();
        actor1.setName("熊大");
        actor1.setHobby(" 打游戏");
        System.out.println("actor1 = " + actor1);

            Actor actor2 = actor1.clone();
            actor2.setName("熊二");
            actor2.setHobby(" 打游戏");
            System.out.println("actor2 = " + actor2);
            Actor actor3 = actor1.clone();
            actor3.setName("熊三");
            actor3.setHobby(" 打游戏");
            System.out.println("actor3 = " + actor3);


    }
}
