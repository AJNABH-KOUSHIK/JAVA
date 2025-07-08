// WRITE A CODE IF MARKS > 30 , ELSE FAIL 
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks > 30) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
