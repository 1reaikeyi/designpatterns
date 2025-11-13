package 抽象工厂pattern;

import 抽象工厂pattern.properties.Material;

public class MathMaterial extends Material {
    @Override
    public void use() {
        System.out.println("使用数学教材：教科书、习题集、参考书");
    }
}
