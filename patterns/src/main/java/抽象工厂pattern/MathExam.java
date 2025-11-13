package 抽象工厂pattern;

public class MathExam extends Exam{
    @Override
    public void test() {
        System.out.println("进行数学考试：计算题、证明题、应用题");
    }
}
