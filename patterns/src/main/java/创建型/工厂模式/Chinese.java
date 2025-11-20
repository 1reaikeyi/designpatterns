package 创建型.工厂模式;

public class Chinese extends Course{
    @Override
    public void make() {
        System.out.println("制作语文课程");
    }
}
