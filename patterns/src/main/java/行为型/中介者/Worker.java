package 行为型.中介者;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
    @Setter@Getter
    private String name;

    public void work(String message) {
        Send.work(name, message);
    }
}
