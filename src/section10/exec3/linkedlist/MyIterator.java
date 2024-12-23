package section10.exec3.linkedlist;

public class MyIterator {
    protected MyNode head = null;
    protected MyNode current = null;

    public MyNode getCurrent() {
        if (current == null) {
            return null;
        }

        return current.getNode();
    }

    public void moveNext() {
        if (current != null) {
            current = current.getNext();
        }
    }
}
