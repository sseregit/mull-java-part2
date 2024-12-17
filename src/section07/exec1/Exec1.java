package section07.exec1;

public class Exec1 {
    public static void main(String[] args) {
        MyString s1 = new MyString();
        s1.setString("Hello");
        MyString s2 = new MyString();
        s2.setString("Hello");

        System.out.println(s1.equals(s2));
    }
}
