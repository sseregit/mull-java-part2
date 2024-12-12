package section04;

class MyTest4 {
    protected int data;

    public void setData(int param) {
        System.out.println("MyTest4.setData");
        this.data = param;
    }
}

class MyTestEx4 extends MyTest4 {
    @Override
    public void setData(int param) {
        System.out.println("MyTestEx4.setData");
        this.data = param;
    }
}

public class OverrideSample {

    public static void main(String[] args) {
        MyTest4 t1 = new MyTestEx4();
        MyTestEx4 t2 = new MyTestEx4();
        MyTest4 t3 = new MyTest4();

        t1.setData(10);
        t2.setData(20);
        t3.setData(30);
    }
}
