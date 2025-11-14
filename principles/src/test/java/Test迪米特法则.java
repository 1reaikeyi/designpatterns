import org.junit.Test;
import 迪米特法则.Compary;
import 迪米特法则.aFans;
import 迪米特法则.aStar;

public class Test迪米特法则 {
    @Test
    public void test() {
        aStar star = new aStar();
        star.setName("star");
        aFans fans = new aFans();
        fans.setName("fans");
        Compary compary = new Compary();
        compary.setStar(star);
        compary.setFan(fans);
        compary.come();


    }
}
