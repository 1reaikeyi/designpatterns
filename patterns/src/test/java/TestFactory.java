import 创建型.工厂模式.Chinesefactory;
import 创建型.工厂模式.Course;
import 创建型.工厂模式.Coursefactory;
import 创建型.工厂模式.Mathfactory;

import 创建型.工厂模式.add.Englishfactory;

public class TestFactory {
    @org.junit.Test
    public void test1() {
        Coursefactory chinesefactory = new Chinesefactory();
        Course chinesecalss = chinesefactory.get();
        System.out.println(chinesecalss.getClass().getName());
        chinesecalss.make();
        Coursefactory mathfactory = new Mathfactory();
        Course math = mathfactory.get();
        System.out.println(math.getClass().getName());
        math.make();
        Coursefactory englishfactory = new Englishfactory();
        Course english = englishfactory.get();
        System.out.println(english.getClass().getName());
        english.make();


    }

}
