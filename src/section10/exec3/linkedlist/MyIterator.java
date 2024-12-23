package section10.exec3.linkedlist;

import java.util.Iterator;

public class MyIterator implements Iterator<MyNode> {

    private MyNode myNode;

    public MyIterator(MyNode myNode) {
        this.myNode = myNode;
    }

    @Override
    public boolean hasNext() {
        return myNode != null;
    }

    @Override
    public MyNode next() {
        MyNode result = myNode;
        myNode = myNode.getNext();
        return result;
    }
}
