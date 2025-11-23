package 行为型.备忘录;

import lombok.Getter;
import lombok.Setter;

public class Record {
    @Getter
    @Setter
    private String state;

    public Origin save() {
        return new Origin(state);
    }
}
