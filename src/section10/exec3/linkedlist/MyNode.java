package section10.exec3.linkedlist;

public abstract class MyNode {

    protected MyNode next;

    public MyNode getNext() {
        return next;
    };

    public abstract String getKey();

    public abstract void printNode();

    public abstract MyNode getNode();
}
