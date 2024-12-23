package section10.exec3;

import section10.exec3.linkedlist.MyNode;

public class UserData extends MyNode {

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

    @Override
    public MyNode getNode() {
        return new UserData(this.name, this.phone);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
