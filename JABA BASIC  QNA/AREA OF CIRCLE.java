// WRITE A CODE FOR AREA OF CIRCLE OF THE INPUT NUMBER
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of Circle: " + area);
    }
}
