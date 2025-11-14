package 合成复用原则;

public class HighStu extends bStu {
    @Override
    public void work() {
        System.out.println("高中生写作业");
    }
//    @Override
//    public void classing() {
//        System.out.println("高中生在教室");
//    }
    @Override
    public void eat() {
        System.out.println("高中生在食堂");
    }

    public void play(){
        System.out.println("高中生在操场");
    }

}
