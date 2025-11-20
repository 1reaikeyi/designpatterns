package 创建型.单例pattern.before;

public class One {
    private One() {
        System.out.println("唯一性");
    }
    // 初始化静态变量 me
    private static One me = new One();
    public static One get() {
        return me;
    }
    public static String one = "one";
/**
 * 修饰符	可见范围（类内）	可见范围（同包）	可见范围（子类）	可见范围（其他包）
 * public	    ✅	             ✅	               ✅          	✅
 * 无（默认）	    ✅	             ✅	               ❌          	❌
 * protected	✅	             ✅	               ✅          	❌
 * private	    ✅	             ❌	               ❌          	❌
 */
}
