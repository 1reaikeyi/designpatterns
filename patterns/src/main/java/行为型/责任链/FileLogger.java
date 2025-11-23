package 行为型.责任链;

import lombok.Getter;
import lombok.Setter;

public abstract class FileLogger {
    public static int info = 1;
    public static int debug = 2;
    public static int warn = 3;
    @Setter @Getter
    public FileLogger nextLogger;
    public int level;

    public void levelMessage(int level, String message) {
        if (level <= this.level) {
            write(message);
        }
        if (nextLogger != null) {
            // 传递给下一个处理器
            nextLogger.levelMessage(level, message);
        }
    }
    public abstract void write(String message);
}
