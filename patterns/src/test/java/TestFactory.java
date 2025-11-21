import org.junit.Test;
import 创建型.单例pattern.Singleton;
import 创建型.单例pattern.before.One;
import 创建型.工厂模式.Chinesefactory;
import 创建型.工厂模式.Course;
import 创建型.工厂模式.Coursefactory;
import 创建型.工厂模式.Mathfactory;

import 创建型.工厂模式.add.Englishfactory;
import 创建型.建造者模式.Build;
import 创建型.建造者模式.BuildFactory;
import 创建型.建造者模式.Car;
import 创建型.建造者模式.Enginer;
import 创建型.抽象工厂pattern.MathCoursefactory;
import 创建型.抽象工厂pattern.properties.Exam;
import 创建型.抽象工厂pattern.properties.Material;


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
    @org.junit.Test
    public void test抽象工厂() {
        MathCoursefactory course = new MathCoursefactory();
        创建型.抽象工厂pattern.properties.Course mathCourse = course.createCourse();
        Exam mathExam = course.createExam();
        Material mathMaterial = course.createMaterial();
        System.out.println("course = " + course.getClass().getName());
        System.out.println("mathCourse = " + mathCourse.getClass().getName());
        System.out.println("mathExam = " + mathExam.getClass().getName());
        System.out.println("mathMaterial = " + mathMaterial.getClass().getName());
        mathCourse.make();
        mathExam.test();
        mathMaterial.use();

    }
    @Test
    public void test建造者模式() {
        Build build = new BuildFactory();
        Enginer enginer = new Enginer(build);
        Car car = enginer.create();
        System.out.println(car);


    }
    @org.junit.Test
    public void test单例One() {
        One one = One.get();
        System.out.println("one = " + one);
        One one1 = One.get();
        System.out.println("one1 = " + one1);
        System.out.println("one1==one:" +( one1 == one));
    }
    @Test
    public void test单例Two() {
        Singleton singleton = Singleton.abc;
        Singleton singleton1 = Singleton.abc;
        System.out.println(singleton instanceof Singleton);
        System.out.println("singleton = " + singleton);
        System.out.println("singleton = " + singleton.getClass());
        System.out.println("singleton==singleton1 = " +( singleton==singleton1));

    }


}
