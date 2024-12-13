package section05;

abstract class Shape {
    abstract public void render();
}

class Triangle extends Shape {

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

public class AbstractSample {
}
