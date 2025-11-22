package 行为型.模板方法;

public abstract class Make {
    public final void make(){
        this.makePPT();
        this.makeWORD();
        if (flag()){
            this.makeExcal();
        }
    }
    public final void makePPT(){
        System.out.println("制作PPT");
    }
    public final void makeWORD(){
        System.out.println("制作word");
    }
    public boolean flag(){
        return false;
    }
    public abstract void makeExcal();

}
