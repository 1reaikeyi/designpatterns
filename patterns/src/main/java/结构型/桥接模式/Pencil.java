package 结构型.桥接模式;

public class Pencil extends Tool{
    private Shape shape;
    public Pencil() {
    }
    public Pencil(Shape shape) {
        super(shape);
        this.shape = shape;

    }
    @Override
    public void use() {
        shape.draw("铅笔");
    }
}
