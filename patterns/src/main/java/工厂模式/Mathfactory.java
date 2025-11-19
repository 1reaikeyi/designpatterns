package 工厂模式;

public class Mathfactory extends Coursefactory{
    public Course get() {
        return new Math();
    }
}
