// WRITE A CODE TO PRINT TO INSERT AN ELEMENT AT THE END OF THE ARRAY
import java.util.Scanner;

public class Q44_InsertAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6]; // 5 initial + 1 new
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to insert at end:");
        arr[5] = sc.nextInt();

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
