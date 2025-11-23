package 行为;

import org.junit.Test;
import 行为型.命令.BuyCloth;
import 行为型.命令.Cloth;
import 行为型.命令.Record;
import 行为型.命令.SellCloth;
import 行为型.命令.Shop;

public class Command {
    @Test
    public void test() {
        Cloth cloth = new Cloth("外套",200);
        Shop buyCloth = new BuyCloth(cloth);
        Shop sellCloth = new SellCloth(cloth);
        buyCloth.execute();
        sellCloth.execute();
        Record record = new Record();
        record.add(cloth);
        record.remove(cloth);

    }
}
