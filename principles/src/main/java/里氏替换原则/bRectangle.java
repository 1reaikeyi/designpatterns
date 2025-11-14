package 里氏替换原则;

public class bRectangle implements aShape{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public void define() {
        System.out.println(getLength() + "\t" + getWidth());
    }
}
