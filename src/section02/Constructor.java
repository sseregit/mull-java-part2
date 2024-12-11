package section02;

public class Constructor {

    private int data = 5;

    public Constructor() {
        data = 10;
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        System.out.println(constructor.getData());
    }
}
