package 行为型.解释器;

// 抽象表达式：定义解释器的公共接口
public interface Interperter {
    // 解释方法：接收上下文（存储变量值），返回计算结果
    int interpret(String context);
}
