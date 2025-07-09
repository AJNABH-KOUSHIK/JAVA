// BLOCK SCOPE EXAMPLE
public class BlockScopeExample {
    public static void main(String[] args) {
        int age = 20; // method scope: available throughout main()

        if (age > 18) {
            String message = "You are an adult."; // block scope: only inside if-block
            System.out.println(message); // ✅ Works
        }

        System.out.println(age); // ✅ Works
        // System.out.println(message); // ❌ Error: 'message' not accessible here
    }
}
