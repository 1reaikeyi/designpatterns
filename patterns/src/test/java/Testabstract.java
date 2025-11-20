
import 创建型.抽象工厂pattern.Coursefactory;
import 创建型.抽象工厂pattern.MathCoursefactory;
import 创建型.抽象工厂pattern.properties.Course;
import 创建型.抽象工厂pattern.properties.Exam;
import 创建型.抽象工厂pattern.properties.Material;

public class Testabstract {
    @org.junit.Test
    public void test2() {
        Coursefactory course = new MathCoursefactory();
        Course mathCourse = course.createCourse();
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
}
