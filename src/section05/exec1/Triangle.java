package section05.exec1;

public class Triangle extends Shape {

    @Override
    public void render() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
