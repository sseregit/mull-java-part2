package section10.exec1;

public class MyList {

    static final UserData head = new UserData("Dummy", "Dummy");

    UserData findNode(String name) {
        UserData tmp = head.next;
        while (tmp != null) {
            if (tmp.name.compareTo(name) == 0) return tmp;

            tmp = tmp.next;
        }
        return null;
    }

    boolean addNewNode(String name, String phone) {
        if (findNode(name) != null) return false;

        UserData newUser = new UserData(name, phone);
        newUser.next = head.next;
        head.next = newUser;

        return true;
    }

    boolean removeNode(String name) {
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

}
