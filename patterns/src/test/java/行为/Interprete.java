package 行为;

import org.junit.Test;
import 行为型.观察者.HexObserver;
import 行为型.观察者.Subject;
import 行为型.解释器.*;
public class Interprete {
    @Test
    public void TestInterprete() {
        NumberExpression numberExpression1 = new NumberExpression(10);
        NumberExpression numberExpression2 = new NumberExpression(20);
        AddExpression addExpression = new AddExpression(numberExpression1, numberExpression2);
        int result = addExpression.interpret("10+20");
        System.out.println("10+20 = "+ result);
        SubstractExpression substractExpression = new SubstractExpression(numberExpression1, numberExpression2);
        result = substractExpression.interpret("10-20");
        System.out.println("10-20 = "+ result);


    }

}
