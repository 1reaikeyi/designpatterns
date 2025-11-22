package 行为型.策略模式;

public class SubstractStrategy implements Strategy{
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }
}
