package 单例pattern;

public class 内部 {
    private static class singleton{
        private static singleton instance = new singleton();

    }
    public static singleton get(){
        return singleton.instance;
    }
}
