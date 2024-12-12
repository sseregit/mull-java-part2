package section04.exec1;

public class Exec1 {

    public static void main(String[] args) {
        MyString str1 = new MyString();
        str1.setString("멍멍이아들");

        MyStringEx str2 = new MyStringEx();
        str2.setString("멍멍이아들");

        System.out.println(str1.getString());
        System.out.println(str2.getString());
    }
}
