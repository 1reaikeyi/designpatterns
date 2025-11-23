package 行为型.责任链;

public class Debug  extends FileLogger {
    public Debug(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("debug:"+message);
    }
}
