package section02;

public class Exec1 {

    public static void main(String[] args) {
        MyStringExec1 str = new MyStringExec1();
        System.out.println(str.length());
        System.out.println(str.getString());

        str.setString("Hello Java");
        System.out.println(str.getString());
        System.out.println(str.length());
        System.out.println(str.compareTo("Hello Java"));
    }

}
