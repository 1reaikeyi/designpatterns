import org.junit.Test;
import 建造者模式.Build;
import 建造者模式.BuildFactory;
import 建造者模式.Car;
import 建造者模式.Enginer;

public class Testbuild {
    @Test
    public void test() {
        Build build = new BuildFactory();
        Enginer enginer = new Enginer(build);
        Car car = enginer.create();
        System.out.println(car);


    }
}
