package section02;

public class ClassSample {

    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        ClassSample classSample = new ClassSample();

        System.out.println("classSample.getClass() = " + classSample.getClass());
        System.out.println("classSample.getData() = " + classSample.getData());
        classSample.setData(10);
        System.out.println("classSample.getData() = " + classSample.getData());

    }
}
