package 结构型.单元模式;

import java.util.HashMap;
import java.util.Map;

// 享元工厂 - 管理部门对象的创建和共享
public class DepartmentFactory {
    private Map<String, Department> map = new HashMap<>();
    // 获取部门对象，如果已存在则返回现有对象，否则创建新对象
    public Department getDepartment(String factory) {
        Department department = map.get(factory);
        if (department == null) {
            department = new Department(factory);
            map.put(factory, department);
            System.out.println("创建新部门：" + factory);
        } else {
            System.out.println("复用已有部门：" +factory);
        }
//        Set<Map.Entry<String, Department>> entrySet = departmentMap.entrySet();
//        for (Map.Entry<String, Department> entry : entrySet) {
//            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
//        }
        return department;
    }

    // 获取当前缓存的部门数量
    public int getDepartmentCount() {
        return map.size();
    }
}