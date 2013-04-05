package arithmeticTree.operators;

import Evaluator.types.DoubleValue;
import Evaluator.types.IntegerValue;
import Evaluator.types.Value;
import Parser.Constant;
import Parser.Operator;
import Parser.Token;
import Parser.UnaryOperator;
import org.junit.Test;
import static org.junit.Assert.*;


public class UnaryOperatorTest {

    @Test
    public void testUnaryOperation(){
        Value value = new DoubleValue(1.0);
        Constant constant = new Constant(value);
        
        Token token = new UnaryOperator(Operator.cos, constant);
        
        assertEquals(0.0, token.evaluate());
    }

}