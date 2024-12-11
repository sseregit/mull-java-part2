package section03;

class Address {
    private String address;
    private String phone;

    public Address(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class User {
    private String name;
    private Address address;

    public User(String name, String address, String phone) {
        this.name = name;
        this.address = new Address(address, phone);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void shallowCopy(User rhs) {
        this.name = rhs.name;
        this.address = rhs.address;
    }

    public void deepCopy(User rhs) {
        this.name = rhs.name;
        this.address.setAddress(rhs.address.getAddress());
        this.address.setPhone(rhs.address.getPhone());
    }


}

public class Copy {

    public static void main(String[] args) {
        User user1 = new User("Hosung", "Hanam", "010-1111-1111");
        User user2 = new User("Hoon", "Seoul", "010-2222-2222");

        System.out.println(user1.getName());
        System.out.println(user1.getAddress().getAddress());
        System.out.println(user1.getAddress().getPhone());

        user1.deepCopy(user2);
        user2.getAddress().setPhone("010-3333-3333");
        user2.getAddress().setAddress("Busan");

        System.out.println(user1.getName());
        System.out.println(user1.getAddress().getAddress());
        System.out.println(user1.getAddress().getPhone());

        user1.shallowCopy(user2);
        user2.getAddress().setPhone("010-4444-4444");
        user2.getAddress().setAddress("Daegu");

        System.out.println(user1.getName());
        System.out.println(user1.getAddress().getAddress());
        System.out.println(user1.getAddress().getPhone());
    }
}
