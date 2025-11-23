package 行为;

import org.junit.Test;
import 行为型.备忘录.Contain;
import 行为型.备忘录.Origin;

import 行为型.备忘录.Record;

public class Memory {
    @Test
    public void test() {
        Contain contain = new Contain();
        Record record = new Record();
        record.setState("first");
        contain.add(record.save());
        record.setState("secord");
        contain.add(record.save());
        record.setState("third");
        contain.add(record.save());
        System.out.println("目前current state= " + record.getState());
        System.out.println("contain.get(0)= " + contain.get(0).getState());

        System.out.println("contain.get(1)= " + contain.get(1).getState());

        System.out.println("contain.get(2)= " + contain.get(2).getState());



    }
}
