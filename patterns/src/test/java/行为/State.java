package 行为;

import org.junit.Test;
import 行为型.状态模式.*;
import 行为型.状态模式.Context;

public class State {
    @Test
    public void test() {
        Context context = new Context();
        Status state1 = new Start();
        state1.operate(context);
        System.out.println(context.getState());
        Status state2 = new End();
        state2.operate(context);
        System.out.println(context.getState());

    }
}
