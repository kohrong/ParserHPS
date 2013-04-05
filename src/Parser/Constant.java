package Parser;

import Parser.Token;
import Evaluator.types.Value;

public class Constant  extends Token {

    Value number;

    public Constant(Value number) {
        this.number = number;
    }

    
    public String toSring() {
       return evaluate().toString();
    }

    
    public Value evaluate() {
        return number;
    }
}
