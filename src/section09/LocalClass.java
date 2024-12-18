package section09;

public class LocalClass {

    static void testFunc(Object obj) {
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        int local = 20;

        class MainWithLocalClass {
            int data;

            public MainWithLocalClass() {
                data = 10;
            }

            void printData() {
                System.out.println(this.data);
                System.out.println(local);
            }
        }

        MainWithLocalClass mainWithLocalClass = new MainWithLocalClass();
        testFunc(mainWithLocalClass);
        mainWithLocalClass.printData();
    }
}
