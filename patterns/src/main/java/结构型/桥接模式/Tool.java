package 结构型.桥接模式;

public abstract class Tool {
    public Tool() {
    }

    public abstract void use();
    public Tool(Shape shape){
        System.out.println("连接到:"+shape);
    }
}
