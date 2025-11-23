package 行为;

import org.junit.Test;
import 行为型.中介者.Send;
import 行为型.中介者.Worker;

public class Mediator {
    @Test
    public void test() {
        Worker use1 = new Worker("use1");
        Worker use2 = new Worker("use2");
       use1.work("你好");
       use2.work("收到");
    }
}
