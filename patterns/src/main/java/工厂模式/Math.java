package 工厂模式;

public class Math extends Course{
    @Override
    public void make() {
        System.out.println("制作数学课程");
    }
}
