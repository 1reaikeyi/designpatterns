package structual;

import 结构型.享元pattern.Department;
import 结构型.享元pattern.DepartmentFactory;

// 客户端类
public class Flyweight {
    public static void main(String[] args) {
        String[] departments = {"研发部门", "市场部门", "人力资源部门", "财务部", "行政部门","研发部门"};
        // 创建享元工厂
        DepartmentFactory factory = new DepartmentFactory();
        // 应该复用
        for (String departmentName : departments) {
            Department department = factory.getDepartment(departmentName);
            department.factory();
        }

        // 打印当前缓存的部门数量
        System.out.println("当前部门数量：" + factory.getDepartmentCount());
    }
}