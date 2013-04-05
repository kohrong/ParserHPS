package Parser;

import Evaluator.CalculatorsMethods;
import Evaluator.types.Value;
import java.lang.reflect.Method;

public class UnaryOperator extends Operation {

    private Operator operator;
    protected Token child;
   

    public UnaryOperator(Operator operator, Token child) {
        this.operator = operator;
        this.child = child;
       
    }

    public Token getChild() {
        return child;
    }

    public Operator getOperator() {
        return operator;
    }
    public String getOperatorSymbol(){
        return operator.getOperator();
    }
    
   

    @Override
    public String toSring() {
        return getOperatorSymbol()+"("+ child.toSring()+")";
    }

    @Override
    public Value evaluate() {
        Value value = this.child.evaluate();
        return execute(value);
    }
    
    private Value execute(Value value){
        try {
            Method method = CalculatorsMethods.methodsMap.get(getSignature(value));
            return (Value)(method.invoke(method.getDeclaringClass().newInstance(),value));
        }
        catch (Exception ex) {
            System.out.println("hola");
            return null;
        }
    }
    
    private String getSignature(Value value){
        String signature = operator.getName()+ value.getClass().getSimpleName();
        return signature;
    }
}
