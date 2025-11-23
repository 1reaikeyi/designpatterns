package 行为型.观察者;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("二进制值：" + Integer.toBinaryString(subject.getNumber()));
    }
}