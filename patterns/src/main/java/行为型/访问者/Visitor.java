package 行为型.访问者;

public interface Visitor {

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Computerfactory computerfactory);

    void visit(Computer computer);
}
