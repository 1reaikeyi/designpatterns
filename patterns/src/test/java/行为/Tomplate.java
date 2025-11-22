package 行为;

import org.junit.Test;
import 行为型.模板方法.Make;
import 行为型.模板方法.Use;

public class Tomplate {
    @Test
    public void test() {
        Make usee = new Use(true);
        usee.make();
        Make notUse = new Use(false);
        notUse.make();


    }
}
