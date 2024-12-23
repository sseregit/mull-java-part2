package section10.exec2;

import section10.exec2.linkedlist.MyList;

class Main {

    public static void main(String[] args) {
        MyList myList = new MyList(new UserData("Dummy", "Dummy"));
        new UserInterface(myList).run();
    }
}
