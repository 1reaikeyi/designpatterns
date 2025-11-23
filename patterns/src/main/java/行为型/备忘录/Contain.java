package 行为型.备忘录;

import java.util.ArrayList;
import java.util.List;

public class Contain {
    private List<Origin> list = new ArrayList<>();
    public void add(Origin origin) {
        list.add(origin);
    }
    public Origin get(int index) {
        return list.get(index);
    }

}
