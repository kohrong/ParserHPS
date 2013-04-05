
package arithmeticTree.operators;

import Parser.BynaryOperator;
import Parser.Operator;
import Parser.Constant;
import org.junit.Test;
import static org.junit.Assert.*;
import Evaluator.types.DoubleValue;
import Parser.Token;
import Evaluator.types.Value;

public class BynaryOperatorTest {
    @Test
    public void testAddDoubleDouble() {
        Value t1 = new DoubleValue(5.0);
        Constant d1 = new Constant(t1);
        Value t2 = new DoubleValue(3.0);
        Constant d2 = new Constant(t2);
        Token token = new BynaryOperator(Operator.add, d1, d2);
        assertEquals(DoubleValue.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(8.0, (Double) token.evaluate().getValue(), 0.001);
        System.out.printf("resultado es "+token.evaluate().getValue());
    }
}
