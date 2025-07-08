// WRITE A CODE FOR AREA OF SQUARE OF THE INPUT NUMBER
import java.util.Scanner;
public class AreaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}
