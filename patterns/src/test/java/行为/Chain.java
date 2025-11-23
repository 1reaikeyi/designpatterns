package 行为;

import org.junit.Test;
import 行为型.责任链.Debug;
import 行为型.责任链.Info;
import 行为型.责任链.FileLodder;
import 行为型.责任链.Warn;

public class Chain {
    @Test
    public void test() {
        // 创建责任链：Info -> Debug -> Warn
        FileLodder infoLogger = new Info(FileLodder.info);
        FileLodder debugLogger = new Debug(FileLodder.debug);
        FileLodder warnLogger = new Warn(FileLodder.warn);
        // 设置责任链顺序
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(warnLogger);
        // 测试不同级别的日志
        System.out.println("\n1. INFO级别日志:");
        infoLogger.logMessage(FileLodder.info, "这是一条普通信息");

        System.out.println("\n2. DEBUG级别日志:");
        infoLogger.logMessage(FileLodder.debug, "这是一条调试信息");

        System.out.println("\n3. WARN级别日志:");
        infoLogger.logMessage(FileLodder.warn, "这是一条警告信息");

        System.out.println("\n4. 不存在的级别日志:");
        infoLogger.logMessage(4, "这条信息不会被任何处理器处理");
    }
}
