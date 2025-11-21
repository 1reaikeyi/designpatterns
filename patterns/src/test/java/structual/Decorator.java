package structual;

import org.junit.Test;
import 结构型.装饰模式.EggPan;
import 结构型.装饰模式.FishPan;
import 结构型.装饰模式.Food;
import 结构型.装饰模式.Pan;

public class Decorator {
    @Test
    public void test装饰模式() {
        Food food = new Pan();
        System.out.println(food.name()+"\t价格："+food.price());
        Food eggPan = new EggPan(new Pan());
        System.out.println(eggPan.name()+"\t价格："+eggPan.price());
        Food fishPan = new FishPan(new Pan());
        System.out.println(fishPan.name()+"\t价格："+fishPan.price());



    }
}
