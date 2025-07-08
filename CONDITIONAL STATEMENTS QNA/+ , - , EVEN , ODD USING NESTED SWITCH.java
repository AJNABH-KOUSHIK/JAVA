// WRITE A CODE FOR POSITIVE/NEGATIVE/EVEN/ODD USING NESTED SWITCH
import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        switch (num > 0 ? 1 : num < 0 ? -1 : 0) {
            case 1:
                switch (num % 2) {
                    case 0: System.out.println("Positive Even"); break;
                    case 1: System.out.println("Positive Odd"); break;
                }
                break;
            case -1:
                System.out.println("Negative");
                break;
            case 0:
                System.out.println("Zero");
                break;
        }
    }
}
