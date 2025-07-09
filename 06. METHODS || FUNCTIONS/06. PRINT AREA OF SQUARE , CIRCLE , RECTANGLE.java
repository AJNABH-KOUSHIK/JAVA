// WRITE A CODE TO PRINT AREA OF SQUARE , CIRCLE , RECTANGLE
import java.util.Scanner;

public class Q22_AreaCalculator {
    static double squareArea(double side) {
        return side * side;
    }

    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double rectangleArea(double l, double b) {
        return l * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Square: " + squareArea(5));
        System.out.println("Circle: " + circleArea(3));
        System.out.println("Rectangle: " + rectangleArea(4, 6));
    }
}
