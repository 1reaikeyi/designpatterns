import org.junit.Test;
import 依赖倒置原则.Computer;
import 依赖倒置原则.aCPU;
import 依赖倒置原则.aScreen;

public class Test依赖倒置原则 {
    @Test
    public void test() {
        aCPU cpu = new aCPU();
        cpu.setName("Intel i7");
        aScreen screen = new aScreen();
        screen.setName("2560*1600");
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setScreen(screen);
        computer.run();



    }
}
