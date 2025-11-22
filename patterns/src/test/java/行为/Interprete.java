package 行为;

import org.junit.Test;
import 行为型.观察者.HexObserver;
import 行为型.观察者.Subject;
import 行为型.解释器.*;
public class Interprete {
    @Test
    public void TestInterprete() {
        String context = "a+b-c";
         Expression expression = new Expression(context);
         System.out.println("表达式：" + context);
         System.out.println("结果：" + expression.interpret(context));

    }

}
