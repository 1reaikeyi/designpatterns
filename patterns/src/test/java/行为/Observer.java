package 行为;

import org.junit.Test;
import 行为型.观察者.BinaryObserver;
import 行为型.观察者.HexObserver;
import 行为型.观察者.Subject;

public class Observer {
    @Test
    public void testInterprete1() {
        Subject subject = new Subject();
        HexObserver hexObserver = new HexObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        System.out.println("第一次设置数值为 10:");
        subject.setNumberAndNotify(10);

        System.out.println("\n=== 移除二进制观察者 ===");
        subject.detach(binaryObserver);
        System.out.println("第二次设置数值为 15:");
        subject.setNumberAndNotify(15);
        System.out.println("\n=== 重新添加二进制观察者 ===");
        subject.attach(binaryObserver);
        System.out.println("设置数值为 100:");
        subject.setNumberAndNotify(100);

        System.out.println("\n=== 清空所有观察者 ===");
        // 移除所有观察者
        subject.detach(hexObserver);
        subject.detach(binaryObserver);
        System.out.println("设置数值为 50 (无观察者):");
        subject.setNumberAndNotify(50);


    }
}
