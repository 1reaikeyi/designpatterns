package 行为型.责任链;

public class Info extends FileLodder {
    public Info(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("info:"+message);
    }
}
