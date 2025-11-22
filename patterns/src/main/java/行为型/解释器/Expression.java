package 行为型.解释器;

// 终结符表达式：解析变量（不可再分解的基本元素）
public class Expression implements Interperter {
    private String channgeName; // 变量名（如 a、b、c）

    public Expression(String variableName) {
        this.channgeName = variableName;
    }
    @Override
    public int interpret(String context) {
      return context.indexOf(channgeName);

    }
}



