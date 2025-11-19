import org.junit.Test;
import 单例pattern.Singleton;
import 单例pattern.before.One;

public class TestOne {
    @org.junit.Test
    public void testOne() {
        One one = One.get();
        System.out.println("one = " + one);
        One one1 = One.get();
        System.out.println("one1 = " + one1);
        System.out.println("one1==one:" +( one1 == one));
    }
    @Test
    public void testTwo() {
        Singleton singleton = Singleton.abc;
        Singleton singleton1 = Singleton.abc;
        System.out.println(singleton instanceof Singleton);
        System.out.println("singleton = " + singleton);
        System.out.println("singleton = " + singleton.getClass());
        System.out.println("singleton==singleton1 = " +( singleton==singleton1));

    }
}
