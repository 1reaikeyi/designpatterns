import org.junit.Test;
import 结构型.桥接模式.Circle;
import 结构型.桥接模式.Pen;
import 结构型.桥接模式.Tool;

public class Test桥接 {
    @Test
    public void test() {
        Tool tool = new Pen(new Circle());
        tool.use();
    }
}
