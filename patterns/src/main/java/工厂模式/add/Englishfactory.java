package 工厂模式.add;
import 工厂模式.Course;
import 工厂模式.Coursefactory;
public class Englishfactory extends Coursefactory{
    @Override
    public Course get() {
        return new English();
    }
}
