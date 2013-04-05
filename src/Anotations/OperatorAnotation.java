
package Anotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface OperatorAnotation {
    String symbol();
}
