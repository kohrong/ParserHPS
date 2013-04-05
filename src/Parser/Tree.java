package Parser;

public class Tree {

    private Token root;

    public Tree(Token root) {
        this.root = root;
    }

    public Token getRoot() {
        return root;
    }

    public Object evaluate() {
        return root.evaluate();
    }
    public String toString(){
        if (getRoot()!=null){
        return getRoot().toSring();
    }
        return "";
    }
}
