package section09;

class Outer {
    private static final int dataStatic = 10;
    private final int data = 5;

    int getInnerData() {
        Inner inner = new Inner();
        return inner.getInDataa();
    }

    static class Inner {
        private static final int inDataStatic = 100;
        private final int inData = 50;

        int getInDataa() {
            return inData;
        }

        int getOuterDataStatic() {
            return Outer.dataStatic;
        }
    }
}

public class NestedStatic {

    public static void main(String[] args) {
        Outer out = new Outer();
        System.out.println(out.getInnerData());

        Outer.Inner inClass = new Outer.Inner();
        System.out.println(inClass.getOuterDataStatic());
    }
}
