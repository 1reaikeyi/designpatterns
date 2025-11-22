package 行为型.模板方法;

public class Use extends Make {
    private boolean flag;
    public Use(boolean flag) {
        this.flag = flag;
    }
    @Override
    public boolean flag() {
        return this.flag;
    }
    @Override
    public void makeExcal() {
        System.out.println("使用模板方法,制作Excal");
    }
}
