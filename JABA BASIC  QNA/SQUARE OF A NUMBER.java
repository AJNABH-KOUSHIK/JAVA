// WRITE A CODE FOR SQUARE OF A INPUT NUMBER
import java.util.Scanner;
public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        System.out.println("Square: " + square);
    }
}
