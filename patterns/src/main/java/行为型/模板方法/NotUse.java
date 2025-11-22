package 行为型.模板方法;

public class NotUse extends Make{
    private boolean flag;
    public NotUse(){
        flag = false;
    }
    public NotUse(boolean flag){
        this.flag = flag;
    }
    @Override
    public boolean flag() {
        return this.flag;
    }
    @Override
    public void makeExcal() {
        //奴处理
        System.out.println();
    }
}
