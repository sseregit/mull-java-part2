package section03;

public class Exec1 {

    public static void main(String[] args) {
        MyStringExec1 str1 = new MyStringExec1("Test");
        System.out.println("str1.getString() = " + str1.getString());
        MyStringExec1 str2 = new MyStringExec1(512);
        System.out.println("str2.getString() = " + str2.getString());
    }
}
