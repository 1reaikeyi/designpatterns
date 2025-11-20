package 结构型.桥接模式;

public class Rectangle implements Shape{
    @Override
    public void draw(String tool) {
        System.out.println("使用-----》"+tool+"画长方形");
    }
}
