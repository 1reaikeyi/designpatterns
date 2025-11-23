package 行为型.解释器;

// 终结符表达式：解析数字（不可再分解的基本元素）
public class NumberExpression implements Interperter {
    private int number; // 数字值

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(String context) {
        // 直接返回数字值，不依赖上下文
        return number;
    }
}




