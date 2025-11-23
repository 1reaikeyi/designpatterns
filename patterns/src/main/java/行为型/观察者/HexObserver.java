package 行为型.观察者;

public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("16进制值：" + Integer.toHexString(subject.getNumber()).toUpperCase());
    }
}
