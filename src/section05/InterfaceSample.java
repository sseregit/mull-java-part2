package section05;

interface Shape2 {
    void render();
}

class Triangle2 implements Shape2 {

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

public class InterfaceSample {
}
