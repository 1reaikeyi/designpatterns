import 单例pattern.before.One;

public class TestOne {
    @org.junit.Test
    public void testOne() {
        One one = One.get();
        System.out.println(one.one);
        System.out.println("one = " + one);
        One one1 = One.get();
        System.out.println("one1 = " + one1);
        System.out.println(one1.one);
    }
}
