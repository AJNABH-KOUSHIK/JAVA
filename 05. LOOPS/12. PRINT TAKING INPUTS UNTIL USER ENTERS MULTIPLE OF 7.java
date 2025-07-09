//   WRITE A CODE FOR KEEP TAKING INPUTS UNTIL USER ENTERS MULTIPLE OF 7
import java.util.Scanner;

public class InputUntilMultipleOf7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
        } while (num % 7 != 0);
    }
}
