package 依赖倒置原则;

public class Computer {
    private aScreen screen;
    private aCPU cpu;

    public aScreen getScreen() {
        return screen;
    }

    public void setScreen(aScreen screen) {
        this.screen = screen;
    }

    public aCPU getCpu() {
        return cpu;
    }

    public void setCpu(aCPU cpu) {
        this.cpu = cpu;
    }
    public void run(){
        System.out.println("Computer run");
        System.out.println("CPU name: " + cpu.getName());
        System.out.println("Screen name: " + screen.getName());
    }
}
