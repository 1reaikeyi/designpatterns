package 抽象工厂pattern;

import 抽象工厂pattern.properties.Course;

public class MathCourse extends Course {
    @Override
    public void make() {
        System.out.println("教授数学课程：代数、几何、微积分");
    }
}
