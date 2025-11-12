package 工厂模式;

public class Mathfactory extends Coursefactory{
    public Math get() {
        return new Math();
    }
}
