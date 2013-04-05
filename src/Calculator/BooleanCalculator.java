 
package Calculator;

import Anotations.OperatorAnotation;

public class BooleanCalculator {
    @OperatorAnotation(symbol="&&")
    public Boolean and(Boolean argument1,Boolean argument2){
return argument1&&argument2;
}    
@OperatorAnotation(symbol="||")
    public Boolean or(Boolean argument1,Boolean argument2){
return argument1||argument2;
}
@OperatorAnotation(symbol="!")
    public Boolean not(Boolean argument){
return !argument;
}
}
