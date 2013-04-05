package Parser;

import Evaluator.types.Value;

public abstract class Token {
   
     public abstract Value evaluate();
     public abstract String toSring();
}
