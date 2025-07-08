// WRITE A CODE TO CHECK IF A NUMBER IS DIVISIBLE BY TWO OR NOT
import java.util.Scanner;
public class DivisibleBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is divisible by 2");
        } else {
            System.out.println(num + " is not divisible by 2");
        }
    }
}
