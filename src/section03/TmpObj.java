package section03;

public class TmpObj {

    public static void main(String[] args) {
        String left = "Hello";
        String right = "World";

        System.out.println((left + right).toUpperCase());
        String result = left + right;
        System.out.println(result);
    }
}
