package structual;

import org.junit.Test;
import 结构型.类适配器.Mediafactory;

public class Adapter {
    @Test
    public void test类适配器() {
        Mediafactory mf = new Mediafactory();
        mf.play("view","video.view");
        mf.play("mp3","aaa");
        mf.play("mp4","mp4.mp4");
    }
}
