package 结构型.桥接模式;

public class Pen extends Tool{
    private Shape shape;
    public Pen(Shape shape) {
        super(shape);
        this.shape = shape;
    }
    public Pen() {
    }

    @Override
    public void use() {

        shape.draw("钢笔");
    }
}
