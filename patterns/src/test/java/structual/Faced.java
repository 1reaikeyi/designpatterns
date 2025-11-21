package structual;

import org.junit.Test;
import 结构型.外观模式.Eat;
import 结构型.外观模式.Resturant;

public class Faced {
    @Test
    public void test外观() {
        Eat food = new Eat("汉堡");
        Resturant resturant = new Resturant();
        resturant.buy(food);

    }
}
