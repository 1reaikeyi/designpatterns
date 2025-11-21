package structual;

import org.junit.Test;
import 结构型.组合模式.Emoploree;

public class Composited {
    @Test
    public void test聚合(){
        Emoploree management = new Emoploree("李华","总理","管理部");
        Emoploree managementer1 = new Emoploree("小明","经理1","管理部");
        Emoploree managementer2 = new Emoploree("小红","经理2","管理部");
        Emoploree emo1 = new Emoploree("Tom","worker","管理部");
        Emoploree emo2 = new Emoploree("Jenry","worker","管理部");
        management.add(managementer1);
        management.add(managementer2);
        managementer1.add(emo1);
        managementer1.add(emo2);
        managementer2.add(emo1);
        managementer2.add(emo2);
        for (Emoploree emoploree : management.getEmoplorees()) {
            System.out.println(management.getName()+" "+management.getJob()+" "+management.getDepartment());
            System.out.println(emoploree.getName()+" "+emoploree.getJob()+" "+emoploree.getDepartment());
            for (Emoploree staff : emoploree.getEmoplorees()) {
                System.out.println(staff.getName()+" "+staff.getJob()+" "+staff.getDepartment());
            }
        }

    }
}
