package 行为型.命令;

import java.util.ArrayList;
import java.util.List;

public class Record {
    List<Cloth> list = new ArrayList<>();
    public void add(Cloth cloth) {
        list.add(cloth);
        cloth.buy();
    }
    public void remove(Cloth cloth) {
        list.remove(cloth);
        cloth.buy();
    }
    public void print() {
        for (Cloth cloth : list) {
            System.out.println(cloth);
        }
    }
}
