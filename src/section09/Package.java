package section09;

import section09.user.UserData;

public class Package {

    public static void main(String[] args) {
        UserData user = new UserData("Hosung");
        System.out.println(user.getName());
    }
}
