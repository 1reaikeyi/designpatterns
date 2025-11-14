import org.junit.Test;
import 合成复用原则.HighStu;
import 合成复用原则.Junior;
import 合成复用原则.School;

public class Test合成复用原则 {
    @Test
    public void test() {
        School school = new School();
        HighStu highStu = new HighStu();
        Junior junior = new Junior();
        school.setJunior(junior);
        school.setHighStu(highStu);
        System.out.println(school);
        junior.eat();
        junior.work();
        junior.classing();
        highStu.eat();
        highStu.work();
        highStu.classing();




    }
}
