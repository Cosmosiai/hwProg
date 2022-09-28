package YaPe;

import org.w3c.dom.Node;

public class Rebro {
    Node parent;
    Node child;
    int value;

    public Rebro(Node parent, Node child, int value) {
        this.parent = parent;
        this.child = child;
        this.value = value;
    }
}
