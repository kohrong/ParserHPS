package Parser;



import Evaluator.CalculatorsMethods;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import Parser.Token;
import Evaluator.types.Value;


public class BynaryOperator extends Operation {
    private Operator operation;
    private Token leftChild;
    private Token rightChild;

    public BynaryOperator(Operator operation, Token leftChild, Token rightChild) {
        this.operation = operation;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    @Override
    public Value evaluate() {
        Value left = leftChild.evaluate();
        Value right = rightChild.evaluate();
        return execute(left, right);
    }

    private Value execute(Value left, Value right) {
        try {
            Method method = CalculatorsMethods.methodsMap.get(getSignature(left, right));
            return (Value)(method.invoke(method.getDeclaringClass().newInstance(),left, right));
        }
        catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
        
    }
    
    private String getSignature(Value left, Value right){
        String signature = operation.getName()+ left.getClass().getSimpleName()+right.getClass().getSimpleName();
        return signature;
    }

    @Override
    public String toSring() {
       return leftChild.toSring()+operation.getOperator()+rightChild.toSring();
    }

}

  

    
            