package 行为型.访问者;

public class Display implements ComputerPartVisitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("组装键盘"+keyboard);
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("组装鼠标"+mouse);
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("组装电脑"+computer);
    }
}
