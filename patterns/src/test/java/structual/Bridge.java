package structual;

import org.junit.Test;
import 结构型.桥接模式.Circle;
import 结构型.桥接模式.Pen;
import 结构型.桥接模式.Tool;

public class Bridge {
    @Test
    public void test桥接() {
        Tool tool = new Pen(new Circle());
        tool.use();
    }
}
