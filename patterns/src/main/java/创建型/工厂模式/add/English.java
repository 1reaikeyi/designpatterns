package 创建型.工厂模式.add;

import 创建型.工厂模式.Course;

public class English extends Course {
    @Override
    public void make() {
        System.out.println("制作english课程");
    }
}
