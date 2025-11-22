package 行为;

import org.junit.Test;
import 行为型.策略模式.AddStrategy;
import 行为型.策略模式.Operation;
import 行为型.策略模式.SubstractStrategy;

public class Strategy {
    @Test
    public void test() {
        Operation operation = new Operation(new AddStrategy());
        int result = operation.operation(1, 2);
        System.out.println(result);
        Operation subtract = new Operation(new SubstractStrategy());
        result = subtract.operation(1, 2);
        System.out.println(result);
    }
}
