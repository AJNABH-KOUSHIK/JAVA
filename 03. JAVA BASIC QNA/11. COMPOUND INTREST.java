// WRITE A CODE FOR COMPOUND INTREST 
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double t = sc.nextDouble();
        double ci = p * Math.pow((1 + r / 100), t) - p;
        System.out.println("Compound Interest: " + ci);
    }
}
