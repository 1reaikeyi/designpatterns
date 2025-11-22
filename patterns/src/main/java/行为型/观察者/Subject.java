package 行为型.观察者;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    @Getter
    @Setter
    private int state;
    public void bind(Observer observer) {
        observers.add(observer);
        response();
    }
    public void response() {
        for (Observer o : observers) {
            o.update();
        }
    }

}
