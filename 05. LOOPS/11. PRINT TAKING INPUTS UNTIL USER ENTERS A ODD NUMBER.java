// WRITE A CODE TO KEEP TAKING INPUTS UNTIL USER ENTERS A ODD NUMBER
import java.util.Scanner;

public class Q6_InputUntilOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
        } while (num % 2 == 0);
    }
}
