package 开闭原则;

public abstract class School implements Daily {

    public void eat(){
        System.out.println("在学校吃饭");
    }
    // 静态方法不能被重写
    public static void driver(){
        System.out.println("在学校开着车");
    }


}
