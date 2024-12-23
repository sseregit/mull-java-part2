package section10.exec3.linkedlist;

public class MyList {

    public final MyNode head;

    public MyList(MyNode head) {
        this.head = head;
    }

    public MyNode findNode(String key) {
        MyNode tmp = head.getNext();
        while (tmp != null) {
            if (tmp.getKey().compareTo(key) == 0) return tmp;

            tmp = tmp.getNext();
        }
        return null;
    }

    public boolean addNewNode(MyNode newNode) {
        if (findNode(newNode.getKey()) != null) return false;

        if (onAddNewNode(newNode)) {
            newNode.next = head.getNext();
            head.next = newNode;
            return true;
        };
        return false;
    }

    protected boolean onAddNewNode(MyNode newNode) {
        return true;
    }

    public boolean removeNode(String key) {
        MyNode prev = head;
        MyNode toDelete = null;

        while (prev.getNext() != null) {
            toDelete = prev.getNext();

            if (toDelete.getKey().compareTo(key) == 0) {
                onRemoveNode(toDelete);
                prev.next = toDelete.getNext();
                return true;
            }

            prev = prev.getNext();
        }

        return false;
    }

    public void onRemoveNode(MyNode node) {}

    public MyIterator makeIterator() {
        MyIterator it = new MyIterator();
        it.head = head.getNext();
        it.current = head.getNext();

        return it;
    }

}
