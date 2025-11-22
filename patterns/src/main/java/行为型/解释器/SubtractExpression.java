package 行为型.解释器;

public class SubtractExpression implements Interperter {
    private Interperter leftExpr;  // 左子表达式
    private Interperter rightExpr; // 右子表达式

    public SubtractExpression(Interperter leftExpr, Interperter rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    @Override
    public int interpret(String context) {
        // 递归解释左右子表达式，再执行减法
        return leftExpr.interpret(context) - rightExpr.interpret(context);
    }
}
