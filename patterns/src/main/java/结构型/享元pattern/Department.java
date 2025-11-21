package 结构型.享元pattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Department implements Emoplory {
    private String name;
    @Override
    public void factory() {
        System.out.println("这里的部门是：" + name);
    }
}
