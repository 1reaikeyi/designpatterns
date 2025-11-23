package 行为型.责任链;

public class Info extends FileLogger {
    public Info(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("info:"+message);
    }
}
