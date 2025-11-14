import org.junit.Test;
import 接口隔离原则.Secrity;

public class Test接口隔离原则 {
    @Test
    public void test() {
        Secrity s = new Secrity();
        s.fire();
        s.safe();

    }
}
