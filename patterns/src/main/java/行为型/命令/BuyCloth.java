package 行为型.命令;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
public class BuyCloth implements Shop{
    private Cloth cloth;

    @Override
    public void execute() {
        cloth.buy();
    }
}
