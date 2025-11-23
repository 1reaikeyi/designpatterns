package 行为型.命令;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SellCloth implements Shop{
    private Cloth cloth;
    @Override
    public void execute() {
        cloth.sell();
    }
}
