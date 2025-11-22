package 结构型.单元模式;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Department {
    private String name;
    public static int i = 0;

    public Department(String name) {
        this.name = name;
        i +=1;
        System.out.println("第" + i + "次创建部门");
    }

}
