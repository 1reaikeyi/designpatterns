package 行为;

import org.junit.Test;
import 行为型.观察者.HexObserver;
import 行为型.观察者.Subject;

public class Observer {
    @Test
    public void testInterprete1() {
        Subject subject = new Subject();
        new HexObserver(subject);
        System.out.println("10进制值：15");
        subject.setState(15);
        System.out.println("10进制值：10");
        subject.setState(10);
    }
}
