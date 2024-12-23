package section10;

import java.util.Scanner;

class UserData {
    String name;
    String phone;
    UserData next;

    public UserData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class addressBook {

    static UserData head = new UserData("Dummy", "Dummy");

    static UserData findNode(String name) {
        UserData tmp = head.next;
        while (tmp != null) {
            if (tmp.name.compareTo(name) == 0) return tmp;

            tmp = tmp.next;
        }
        return null;
    }

    static boolean addNewNode(String name, String phone) {
        if (findNode(name) != null) return false;

        UserData newUser = new UserData(name, phone);
        newUser.next = head.next;
        head.next = newUser;

        return true;
    }

    static void addUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Phone: ");
        String phone = s.nextLine();

        addNewNode(name, phone);
    }

    static void searchUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();

        UserData user = findNode(name);
        if (user != null) {
            System.out.println("Name: " + user.name + "\nPhone: " + user.phone + "\n");
        } else {
            System.out.println("Error: Failed to find " + name);
        }
    }

    static void printAll() {
        UserData tmp = head.next;
        while (tmp != null) {
            System.out.println(tmp.name + "\t" + tmp.phone);
            tmp = tmp.next;
        }
    }

    static boolean removeNode(String name) {
        UserData prev = head;
        UserData toDelete = null;

        while (prev.next != null) {
            toDelete = prev.next;

            if (toDelete.name.compareTo(name) == 0) {
                prev.next = toDelete.next;
                return true;
            }

            prev = prev.next;
        }

        return false;
    }

    static void removeUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();

        if (removeNode(name)) {
            System.out.println("Removed!");
        } else {
            System.out.println("Error: Failed to remove " + name);
        }
    }

    static int printUi() {
        System.out.println("[1] Add\t [2] Search\t[3] Print all\t[4] Remove\t[0] Exit");
        Scanner s = new Scanner(System.in);
        System.out.print(": ");
        int input = s.nextInt();
        return input;
    }

    public static void main(String[] args) {
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
