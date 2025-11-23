package 行为;

import org.junit.Test;
import 行为型.访问者.*;
import 行为型.访问者.ComputerPartVisitor;

public class Visitor {
    @Test
    public void test() {
        ComputerPart computer = new Computer();
        computer.accept(new Display());
    }
}
