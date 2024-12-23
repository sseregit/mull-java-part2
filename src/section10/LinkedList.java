package section10;

class MyNode {
    public String data;
    public MyNode next = null;

    public MyNode(String data) {
        this.data = data;
    }
}

public class LinkedList {

    public static void main(String[] args) {
        MyNode head = new MyNode("First");
        head.next = new MyNode("Second");
        head.next.next = new MyNode("Third");

        MyNode tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
