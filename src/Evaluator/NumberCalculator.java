
package Evaluator;

import Anotations.OperatorAnotation;
import Evaluator.types.DoubleValue;
import Evaluator.types.IntegerValue;
import Evaluator.types.Value;


public class NumberCalculator extends Calculator {
    
    @OperatorAnotation(symbol="+")
    public Value add(DoubleValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() + arg1.getValue());
    }

    @OperatorAnotation(symbol="+")
    public Value add(DoubleValue arg0, IntegerValue arg1) {
        return new DoubleValue(arg0.getValue() + arg1.getValue());
    }
   
    @OperatorAnotation(symbol="+")
    public Value add(IntegerValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() + arg1.getValue());
    }
    
    @OperatorAnotation(symbol="+")
    public Value add(IntegerValue arg0, IntegerValue arg1) {
        return new IntegerValue(arg0.getValue() + arg1.getValue());
    }
    
    @OperatorAnotation(symbol="-")
    public Value substract(DoubleValue arg0, DoubleValue arg1){
        return new DoubleValue(arg0.getValue() - arg1.getValue());
    }
    
    @OperatorAnotation(symbol="-")
    public Value substract(DoubleValue arg0, IntegerValue arg1){
        return new DoubleValue(arg0.getValue() - arg1.getValue());
    }
    
    @OperatorAnotation(symbol="-")
    public Value substract(IntegerValue arg0, DoubleValue arg1){
        return new DoubleValue (arg0.getValue() - arg1.getValue());
    }
    
    @OperatorAnotation(symbol="-")
    public Value substract(IntegerValue arg0, IntegerValue arg1){
        return new IntegerValue(arg0.getValue() - arg1.getValue());
    }
    
    @OperatorAnotation(symbol="*")
    public Value product(DoubleValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorAnotation(symbol="*")
    public Value product(DoubleValue arg0, IntegerValue arg1) {
        return new DoubleValue(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorAnotation(symbol="*")
    public Value product(IntegerValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorAnotation(symbol="*")
    public Value product(IntegerValue arg0, IntegerValue arg1) {
        return new IntegerValue(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorAnotation(symbol="c")
    public Value coseno(IntegerValue arg0){
        return new DoubleValue(Math.cos(arg0.getValue()));
    }
}