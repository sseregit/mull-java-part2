package section02.exec1;

public class Exec1 {

    public static void main(String[] args) {
        MyString str = new MyString();
        System.out.println(str.length());
        System.out.println(str.getString());

        str.setString("Hello Java");
        System.out.println(str.getString());
        System.out.println(str.length());
        System.out.println(str.compareTo("Hello Java"));
    }

}
