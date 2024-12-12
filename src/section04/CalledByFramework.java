package section04;

class MyTest5 {
    protected int data;

    public void setData(int param) {
        System.out.println("MyTest5.setData");
        if (onSetData(param)) this.data = param;
        else this.data = 0;
    }

    public int getData() {
        return data;
    }

    protected boolean onSetData(int param) {
        System.out.println("MyTest5.onSetData");
        return true;
    }
}

class MyTestEx5 extends MyTest5 {
    //Called by framework
    @Override
    protected boolean onSetData(int param) {
        System.out.println("MyTestEx5.onSetData");
        return param <= 100 && param >= 0;
    }
}

public class CalledByFramework {

    public static void main(String[] args) {
        MyTestEx5 t = new MyTestEx5();
        t.setData(-5);
        System.out.println("t.getData() = " + t.getData());
    }
}
