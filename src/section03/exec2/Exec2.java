package section03.exec2;

public class Exec2 {

    public static void main(String[] args) {
        MyString src = new MyString("Hello");
        MyString dst = new MyString(src);

        src.setString("World");
        System.out.println(dst.getString());
    }
}
