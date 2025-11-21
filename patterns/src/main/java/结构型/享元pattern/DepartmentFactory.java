package 结构型.享元pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 享元工厂 - 管理部门对象的创建和共享
public class DepartmentFactory {
    private Map<String, Department> departmentMap = new HashMap<>();
    // 获取部门对象，如果已存在则返回现有对象，否则创建新对象
    public Department getDepartment(String Name) {
        Department department = departmentMap.get(departmentName);
        if (department == null) {
            department = new Department(departmentName);
            departmentMap.put(departmentName, department);
            System.out.println("创建新部门：" + departmentName);
        } else {
            System.out.println("复用已有部门：" + departmentName);
        }
//        Set<Map.Entry<String, Department>> entrySet = departmentMap.entrySet();
//        for (Map.Entry<String, Department> entry : entrySet) {
//            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
//        }

        return department;
    }

    // 获取当前缓存的部门数量
    public int getDepartmentCount() {
        return departmentMap.size();
    }
}