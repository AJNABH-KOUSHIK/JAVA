// WRITE A CODE IF A AGE IS GREATER THAN 18 ADULT , 13-18 TEEN , ELSE CHILD
import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teen");
        } else {
            System.out.println("Child");
        }
    }
}
