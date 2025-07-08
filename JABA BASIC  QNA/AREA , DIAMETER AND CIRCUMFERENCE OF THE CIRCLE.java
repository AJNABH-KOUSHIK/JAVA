// WRITE A CODE FOR AREA , DIAMETER AND CIRCUMFERENCE OF THE INPUT NUMBER BY USING RADIUS AS INPUT
import java.util.Scanner;
public class CircleProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        double diameter = 2 * r;
        double circumference = 2 * Math.PI * r;
        System.out.println("Area: " + area);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
    }
}
