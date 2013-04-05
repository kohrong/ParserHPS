
package Parser;

public class Operator {
  public static final Operator add = new Operator("add",'+',OperationType.BINARY);
    public static final Operator substract = new Operator("substract",'-',OperationType.BINARY);
    public static final Operator product = new Operator("product",'*',OperationType.BINARY);
    public static final Operator cos = new Operator("coseno",'c',OperationType.UNARY);
    
    private String name;
    private final char operator;
    private final OperationType operatorType;

    private Operator(String name) {
        this(name, ' ',OperationType.BINARY);
    }
    
    private Operator(String name, char operator, OperationType operatorType) {
        this.name = name;
        this.operator = operator;
        this.operatorType = operatorType;
    }

    public String getName() {
        return name;
    }
    
    public String getOperator() {
        if (operator == ' ') return name;
        return Character.toString(operator);
    }
    
}
