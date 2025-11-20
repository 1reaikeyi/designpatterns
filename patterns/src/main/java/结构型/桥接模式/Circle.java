package 结构型.桥接模式;

public class Circle implements Shape {
    @Override
    public void draw(String tool) {
        System.out.println("使用"+tool+"画圆");
    }

}
