package 行为型.责任链;

public abstract class FileLodder {
    public static int info = 1;
    public static int debug = 2;
    public static int warn = 3;
    public FileLodder nextLogger;
    public int level;
    public void setNextLogger(FileLodder nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void logMessage(int level, String message) {
        if (level <= this.level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
    public abstract void write(String message);
}
