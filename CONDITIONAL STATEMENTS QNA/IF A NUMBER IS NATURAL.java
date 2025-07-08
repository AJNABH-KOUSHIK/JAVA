// WRITE A CODE TO CHECK IF A NUMBER IS NATURAL
import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Natural Number");
        } else {
            System.out.println("Not a Natural Number");
        }
    }
}
