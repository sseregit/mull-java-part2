package section10.exec2;

import section10.exec2.linkedlist.MyNode;

public final class UserData extends MyNode {

    private String name;
    private String phone;

    public UserData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String getKey() {
        return this.name;
    }

    @Override
    public void printNode() {
        System.out.println("Name: " + this.name + "\nPhone: " + this.phone + "\n");
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
