package 行为型.中介者;

import 行为型.模板方法.Use;

public class Send {
    public static void work(String name, String message) {
        System.out.println(name + "发送了消息：" + message);
    }
}
