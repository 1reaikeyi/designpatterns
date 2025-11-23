package 行为型.责任链;

public class Warn extends FileLodder {
    public Warn(int level){
        this.level = level;
    }
    @Override
    public void write(String message) {
        System.out.println("Warn: " + message);
    }
}
