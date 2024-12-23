package section10.exec1;

import java.util.Scanner;

class UserInterface {

    private final MyList myList = new MyList();

    void addUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Phone: ");
        String phone = s.nextLine();

        myList.addNewNode(name, phone);
    }

    void searchUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();

        UserData user = myList.findNode(name);
        if (user != null) {
            System.out.println("Name: " + user.name + "\nPhone: " + user.phone + "\n");
        } else {
            System.out.println("Error: Failed to find " + name);
        }
    }

    void printAll() {
        UserData tmp = MyList.head.next;
        while (tmp != null) {
            System.out.println(tmp.name + "\t" + tmp.phone);
            tmp = tmp.next;
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
