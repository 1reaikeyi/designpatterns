package 抽象工厂pattern;

import 抽象工厂pattern.properties.Course;
import 抽象工厂pattern.properties.Exam;
import 抽象工厂pattern.properties.Material;

public abstract class Coursefactory {
    public abstract Course createCourse(); // 返回抽象类型Course
    public abstract Exam createExam(); // 返回抽象类型Exam
    public abstract Material createMaterial(); // 返回抽象类型Material
}


