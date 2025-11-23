package 行为型.观察者;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    @Getter
    @Setter
    private int number;

    // 添加观察者
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    // 移除观察者
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 通知所有观察者
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    // 设置数值并通知观察者
    public void setNumberAndNotify(int number) {
        this.number = number;
        notifyObservers();
    }
}
