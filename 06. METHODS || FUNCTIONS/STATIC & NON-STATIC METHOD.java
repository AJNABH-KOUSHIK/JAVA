class Test {
    static void myMethod() {
        System.out.println("Hello from static method!");
    }
    void normalMethod() {
        System.out.println("Hello from normal method!");
    }
}
public class Main {
    public static void main(String[] args) {
        // Call static method without object
        Test.myMethod();
        // Call non-static method (requires object)
        Test obj = new Test();
        obj.normalMethod();
    }
}
