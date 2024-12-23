package section10.exec2.linkedlist;

public abstract class MyNode {

    protected MyNode next;

    public MyNode getNext() {
        return next;
    };

    public abstract String getKey();

    public abstract void printNode();
}
