package 行为型.访问者;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
