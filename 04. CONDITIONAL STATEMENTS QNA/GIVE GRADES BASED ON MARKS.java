// WRITE A CODE TO GIVE GRADES BASED ON MARKS
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks < 30) {
            System.out.println("Grade: C");
        } else if (marks < 70) {
            System.out.println("Grade: B");
        } else if (marks < 90) {
            System.out.println("Grade: A");
        } else if (marks <= 100) {
            System.out.println("Grade: A++");
        } else {
            System.out.println("Invalid Marks");
        }
    }
}
