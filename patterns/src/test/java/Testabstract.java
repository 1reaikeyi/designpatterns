
import 抽象工厂pattern.*;

public class Testabstract {
    @org.junit.Test
    public void test2() {
        Coursefactory course = new MathCoursefactory();
        Course mathCourse = course.createCourse();
        Exam mathExam = course.createExam();
        Material mathMaterial = course.createMaterial();
        mathCourse.make();
        mathExam.test();
        mathMaterial.use();

    }
}
