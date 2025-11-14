package 接口隔离原则;

public class Secrity implements aDoor,aFire{
    @Override
    public void safe() {
        System.out.println("防盗");
    }

    @Override
    public void fire() {
        System.out.println("防火");
    }
}
