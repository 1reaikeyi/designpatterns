package 行为型.状态模式;

public class End implements Status {
    @Override
    public void operate(Context context) {
        System.out.println("结束");
        context.setState(this);
    }
    public String toString(){
        return "正在结束";
    }
}
