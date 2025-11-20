import org.junit.Test;

import 结构型.类适配器.Mediafactory;

public class Test类适配器 {
    @Test
    public void test() {
        Mediafactory mf = new Mediafactory();
        mf.play("view","video.view");
        mf.play("mp3","aaa");
        mf.play("mp4","mp4.mp4");
    }
}
