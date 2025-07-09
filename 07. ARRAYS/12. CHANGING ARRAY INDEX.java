// CHANGING ARRAY INDEX
public class ChangeArrayIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // original array

        System.out.println("Before change: " + numbers[2]); // prints 3

        // Change the value at index 2 (3rd element)
        numbers[2] = 10;

        System.out.println("After change: " + numbers[2]); // prints 10
    }
}
