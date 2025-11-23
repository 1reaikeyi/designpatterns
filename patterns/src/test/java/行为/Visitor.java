package 行为;

import org.junit.Test;
import 行为型.访问者.*;

public class Visitor {
    @Test
    public void test() {
        ComputerPart keyboard = new Keyboard();
        ComputerPart mouse = new Mouse();
        keyboard.accept(new ComputerVisitor());
        mouse.accept(new ComputerVisitor());
        ComputerPart computer = new Computer();
        computer.accept(new ComputerVisitor());
        ComputerPart computerfactory = new Computerfactory();
        computerfactory.accept(new ComputerVisitor());
    }
}
