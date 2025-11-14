import org.junit.Test;
import 接口隔离原则.Secrity;

public class Test4 {
    @Test
    public void test() {
        Secrity s = new Secrity();
        s.fire();
        s.safe();

    }
}
