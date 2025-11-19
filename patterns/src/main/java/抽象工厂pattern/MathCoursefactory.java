package 抽象工厂pattern;

import 抽象工厂pattern.properties.*;

public class MathCoursefactory extends Coursefactory{
    @Override
    public Course createCourse() {
        return new MathCourse(); } // 返回值改为Course（仍实例化Math）
    @Override
    public Exam createExam() {
        return new MathExam(); } // 返回值改为Exam（仍实例化MathExam）
    @Override
    public Material createMaterial() {
        return new MathMaterial(); } // 返回值改为Material（仍实例化MathMaterial）
}

