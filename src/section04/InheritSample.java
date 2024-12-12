package section04;

class MyTest1 {
    private final int parentData = 10;

    public int getData() {
        return parentData;
    }

    public void printData() {
        System.out.println(parentData);
    }
}

class MyTestEx1 extends MyTest1 {
    private int childData = 20;

    public int getChildData() {
        return childData;
    }
}

public class InheritSample {
    public static void main(String[] args) {
        MyTestEx1 t = new MyTestEx1();
        System.out.println(t.getData());
        System.out.println(t.getChildData());
    }
}
