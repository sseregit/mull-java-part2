package section09;

abstract class Parent {
    public void print() {};
}

class Child extends Parent {
    @Override
    public void print() {
        System.out.println("Child.print");
    }
}

public class AnonymousSample {

    public static void main(String[] args) {
        Parent p1 = new Child();
        p1.print();

        Parent p2 = new Parent() {
            @Override
            public void print() {
                System.out.println("Anonymous.print");
            }
        };
        p2.print();
    }
}
