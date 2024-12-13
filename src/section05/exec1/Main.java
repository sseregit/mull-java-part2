package section05.exec1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        Shape shape;
        if (input == 0) {
            shape = new Rectangle();
        } else {
            shape = new Triangle();
        }

        shape.render();
    }
}
