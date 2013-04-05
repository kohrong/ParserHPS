
package Evaluator.types;

public class Value<Tvalue> {
    private Tvalue objeto;

    public Value(Tvalue objeto) {
        this.objeto = objeto;
    }

    public Tvalue getValue() {
        return objeto;
    }
    public String ToString(){
        return objeto.toString();
    }
    
}
