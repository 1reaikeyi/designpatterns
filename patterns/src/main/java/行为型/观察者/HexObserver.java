package 行为型.观察者;

public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.bind(this);
    }

    @Override
    public void update() {
        System.out.println("变化"+Integer.toHexString(subject.getState()));
    }
}
