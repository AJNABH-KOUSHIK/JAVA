// METHOD SCOPE EXAMPLE
public class MethodScopeExample {
    public static void main(String[] args) {
        int number = 5; // This variable has method scope: only accessible inside main()

        System.out.println("Inside main: " + number);
    }

    public static void anotherMethod() {
        // System.out.println(number); // ❌ This will cause an error because 'number' is not in scope here
        int otherNumber = 10; // This variable has method scope: only accessible inside anotherMethod()
        System.out.println("Inside anotherMethod: " + otherNumber);
    }
}
