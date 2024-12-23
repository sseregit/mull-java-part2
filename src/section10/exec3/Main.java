package section10.exec3;

import section10.exec3.linkedlist.MyList;
import section10.exec3.linkedlist.MyListEx;

class Main {

    public static void main(String[] args) {
        MyList myList = new MyListEx(new UserData("Dummy", "Dummy"));
        new UserInterface(myList).run();
    }
}
