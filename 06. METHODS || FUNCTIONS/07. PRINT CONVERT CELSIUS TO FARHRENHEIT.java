// WRITE A CODE TO PRINT CONVERT CELSIUS TO FARHRENHEIT
import java.util.Scanner;

public class CtoF {
    static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + celsiusToFahrenheit(c));
    }
}
