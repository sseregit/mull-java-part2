package section08;

public class TmpStringObj {

    public static void main(String[] args) {
        String hello = "hello";
        hello += "World";
        System.out.println(hello);

        System.out.println((hello + " TempObj").concat(" Test"));
    }
}
