package section10.exec3.linkedlist;

import section10.exec3.UserData;

public class MyListEx extends MyList {
    public MyListEx(UserData dummyHead) {
        super(dummyHead);
    }

    @Override
    public void onRemoveNode(MyNode node) {
        UserData user = (UserData) node;
        System.out.print("MyListEx.onRemoveNode(");
        System.out.println(node.getKey() + ")");
    }
}
