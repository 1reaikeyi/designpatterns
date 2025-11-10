package 开闭原则;

public class Stu implements Daily{
    @Override
    public void eat() {
        System.out.println("在食堂");
    }

    @Override
    public void classing() {
        System.out.println("在教室");
    }
    public void work(){
        System.out.println("写作业");
    }
}
