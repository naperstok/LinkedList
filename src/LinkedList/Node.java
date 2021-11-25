package LinkedList;

public class Node {

    protected int value;
    protected Node next;
    protected Node prev;

    public Node(int v) {
        this.value = v;
        this.next = null;
        this.prev = null;
    }

    public Node() {
        this.value = 0;
        this.next = null;
        this.prev = null;
    }

    public String toString() {
        String S = "Value: " + this.value + "\nprev: " + this.prev + "\nnext: " + this.next;
        return S;
    }

    public Node(int v, Node next)
    {
        this.value = v;
        this.next = next;
        this.prev = null;
    }
}
