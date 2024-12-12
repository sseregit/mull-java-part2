package section04;

class MyTest3 {
    MyTest3() {
        System.out.println("MyTest3.MyTest3");
    }

    MyTest3(int param) {
        System.out.println("MyTest3.MyTest3.param = " + param);
    }
}

class MyTestEx3 extends MyTest3 {
    MyTestEx3() {
        System.out.println("MyTestEx3.MyTestEx3");
    }

    MyTestEx3(int param) {
        super(param);
        System.out.println("MyTestEx3.MyTestEx3.param = " + param);
    }
}

public class SuperSample {

    public static void main(String[] args) {
        MyTest3 myTest3 = new MyTestEx3(3);
    }
}
