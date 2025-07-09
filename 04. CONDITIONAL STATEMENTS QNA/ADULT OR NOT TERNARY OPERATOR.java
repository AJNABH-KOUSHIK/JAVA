// WRITE A CODE TO PRINT ADULT USING TERNARY OPERATOR
import java.util.Scanner;

public class AdultTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        String result = (age >= 18) ? "Adult" : "Not Adult";
        System.out.println(result);
    }
}
