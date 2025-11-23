package 行为型.访问者;

public class Computerfactory implements ComputerPart{
    ComputerPart[] parts = {new Mouse(), new Keyboard()};
    @Override
    public void accept(Visitor visitor) {
        for (ComputerPart computerPart : parts) {
            computerPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
