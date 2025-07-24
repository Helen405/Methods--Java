package staticplay;

public class DemoStructure {
    public DemoStructure() {
        System.out.println("Constructor triggered.");
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void staticOne() {
        System.out.println("Static method one.");
    }

    public static void staticTwo() {
        System.out.println("Static method two.");
    }
}
