package section09;

class UserData {
    private String name;
    private Address info;

    public Address getInfo() {
        return info;
    }

    public UserData(String name, String addr, String phone) {
        this.name = name;
        this.info = new Address(addr, phone);
    }

    class Address {
        private String addr;
        private String phone;

        Address(String addr, String phone) {
            this.addr = addr;
            this.phone = phone;
        }

        public String getUserInfo() {
            return UserData.this.name + ", " + addr + ", " + phone;
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        UserData user = new UserData("Hosung", "Seoul", "010-1111-111");
        System.out.println(user.getInfo().getUserInfo());

        UserData.Address addr = user.new Address("Hanam", "010-2222-2222");
        System.out.println(addr.getUserInfo());

        System.out.println(user.getInfo().getUserInfo());
    }
}
