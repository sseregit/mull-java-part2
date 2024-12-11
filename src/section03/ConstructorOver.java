package section03;

public class ConstructorOver {

    private String name;
    private int age;

    public ConstructorOver() {
        System.out.println("ConstructorOver.ConstructorOver");
    }

    public ConstructorOver(String name, int age) {
        this();
        System.out.println("ConstructorOver.ConstructorOver(String, int)");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ConstructorOver constructorOver = new ConstructorOver("h", 99);
        System.out.println("constructorOver.getName() = " + constructorOver.getName());
        System.out.println("constructorOver.getAge() = " + constructorOver.getAge());
    }
}
