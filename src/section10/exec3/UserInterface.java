package section10.exec3;

import section10.exec3.linkedlist.MyIterator;
import section10.exec3.linkedlist.MyList;
import section10.exec3.linkedlist.MyNode;

import java.util.Scanner;

class UserInterface {

    private final MyList myList;

    public UserInterface(MyList myList) {
        this.myList = myList;
    }

    void addUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Phone: ");
        String phone = s.nextLine();

        myList.addNewNode(new UserData(name, phone));
    }

    void searchUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();

        MyNode node = myList.findNode(name);
        if (node != null) {
            node.printNode();
        } else {
            System.out.println("Error: Failed to find " + name);
        }
    }

    void removeUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();

        if (myList.removeNode(name)) {
            System.out.println("Removed!");
        } else {
            System.out.println("Error: Failed to remove " + name);
        }
    }

    int printUi() {
        System.out.println("[1] Add\t [2] Search\t[3] Print all\t[4] Remove\t[0] Exit");
        Scanner s = new Scanner(System.in);
        System.out.print(": ");
        int input = s.nextInt();
        return input;
    }

    public void printAll() {
        MyIterator it = myList.makeIterator();
        UserData currentNode;
        while((currentNode = (UserData)it.getCurrent()) != null) {
            currentNode.printNode();
            it.moveNext();
        }
    }


    void run() {
        int menu = 0;
        while ((menu = printUi()) != 0) {
            switch (menu) {
                case 1:
                    addUser();
                    break;
                case 2:
                    searchUser();
                    break;
                case 3:
                    printAll();
                    break;
                case 4:
                    removeUser();
                    break;
            }
        }
    }
}
