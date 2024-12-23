package section10.exec3;

import section10.exec3.linkedlist.MyList;

class Main {

    public static void main(String[] args) {
        MyList myList = new MyList(new UserData("Dummy", "Dummy"));
        new UserInterface(myList).run();
    }
}
