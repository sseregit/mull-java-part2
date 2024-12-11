package section02;

public class ThisSample {

    public int data;

    public ThisSample(int data) {
        this.data = data;
    }

    void printData() {
        int data = 3;
        System.out.println(this.data + data);
    }

    public static void main(String[] args) {
        ThisSample t1 = new ThisSample(5);
        ThisSample t2 = new ThisSample(10);

        System.out.println(t1.data);
        System.out.println(t2.data);
        t1.printData();
        t2.printData();
    }
}
