package 行为型.访问者;

public class Computer implements ComputerPart{
    ComputerPart[] parts = {new Mouse(), new Keyboard()};
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : parts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
