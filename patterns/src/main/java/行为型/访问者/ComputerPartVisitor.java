package 行为型.访问者;

public interface ComputerPartVisitor {

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Computer computer);
}
