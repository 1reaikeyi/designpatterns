package 行为型.命令;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Cloth {
    private String name;
    private int price;
    public void buy() {
        System.out.println("购买了" + name + "，价格为" + price);
    }
    public void sell() {
        System.out.println("卖出了" + name + "，价格为" + price);
    }
}
