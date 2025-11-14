package 合成复用原则;

public class Junior extends bStu{
    @Override
    public void work() {
        System.out.println("初中生写作业");
    }
    @Override
    public void classing() {
        System.out.println("初中生在教室");
    }
    @Override
    public void eat() {
        System.out.println("初中生在食堂");
    }
}
