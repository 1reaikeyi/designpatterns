package 行为型.状态模式;

public class Start implements Status {
    @Override
    public void operate(Context context) {
        System.out.println("开始");
        context.setState(this);
    }
    public String toString(){
        return "正在进行";
    }
}
