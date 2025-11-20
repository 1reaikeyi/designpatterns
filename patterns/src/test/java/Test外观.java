import org.junit.Test;
import 结构型.外观模式.Food;
import 结构型.外观模式.Resturant;

public class Test外观 {
    @Test
    public void test() {
        Food food = new Food("汉堡");
        Resturant resturant = new Resturant();
        resturant.buy(food);

    }
}
