package section04;

class MyTest2 {
    private int parentData = 10;

    MyTest2() {
        System.out.println("MyTest.MyTest");
    }
}

class MyTestEx2 extends MyTest2 {
    private int childData = 20;
    MyTestEx2() {
        System.out.println("MyTestEx.MyTestEx");
    }
}

public class ConstructorCallStack {

    public static void main(String[] args) {
        MyTestEx2 myTestEx2 = new MyTestEx2();
    }
}
