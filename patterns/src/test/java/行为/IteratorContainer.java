package 行为;

import org.junit.Test;
import 行为型.迭代模式.*;

public class IteratorContainer {
    @Test
    public void test() {
        UseContainer useContainer = new UseContainer();
        useContainer.str = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        Iterator iterator = useContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
