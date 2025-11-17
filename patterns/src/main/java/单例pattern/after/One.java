package 单例pattern.after;

public class One {
    private One() {
        System.out.println("唯一性");
    }
    // 初始化静态变量 me
    private static One me;
    public static One get() {
        if (me == null) {
            me = new One();
        }
        return me;
    }
    String one = "one";
}
