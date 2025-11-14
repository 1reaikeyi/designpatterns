import org.junit.Test;
import 里氏替换原则.bRectangle;
import 里氏替换原则.bSquare;

public class Test2 {
    @Test
    public void test() {
       bRectangle bRectangle = new bRectangle();
       bRectangle.setLength(10);
       bRectangle.setWidth(10);
       bRectangle.define();
       bSquare bSquare = new bSquare();
       bSquare.setLength(10);
       bSquare.define();

    }
}
