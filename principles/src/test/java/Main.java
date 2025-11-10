import 开闭原则.Daily;
import 开闭原则.HighStu;
import 开闭原则.Stu;
import org.junit.Test;
public class Main {
    @Test
    public void test1() {
        //向上转型
       Daily daily = new Stu();
       daily.eat();
       daily.classing();
    }
    @Test
    public void test2() {
        HighStu highStu = new HighStu();
        highStu.eat();
        highStu.classing();
        highStu.work();
        System.out.println("-----------------");
        //这个对象是父类的引用，指向子类的对象,实际是子类的对象
        Stu stu = new HighStu();
        System.out.println(stu.getClass());
        //调用父类的方法，子类重写了该方法，调用子类的方法
        stu.eat();
        //调用父类的方法，子类没有重写了该方法，调用父类的方法
        stu.classing();
        //调用子类的方法，子类重写了该方法，调用子类的方法
        stu.work();
//        if (stu instanceof HighStu) {
//            ((HighStu) stu).play();
//        }

    }
}