package section10.exec2.linkedlist;

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

        newNode.next = head.getNext();
        head.next = newNode;

        return true;
    }

    public boolean removeNode(String key) {
        MyNode prev = head;
        MyNode toDelete = null;

        while (prev.getNext() != null) {
            toDelete = prev.getNext();

            if (toDelete.getKey().compareTo(key) == 0) {
                prev.next = toDelete.getNext();
                return true;
            }

            prev = prev.getNext();
        }

        return false;
    }

}
