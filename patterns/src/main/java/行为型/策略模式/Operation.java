package 行为型.策略模式;

public class Operation {
    private Strategy strategy;
    public Operation(Strategy strategy) {
        this.strategy = strategy;
    }
    public int operation(int num1, int num2) {
        return strategy.operation(num1, num2);
    }

}
