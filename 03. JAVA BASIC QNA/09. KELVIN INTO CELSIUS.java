// WRITE A CODE TO CONVERT KELVIN INTO CELSIUS 
import java.util.Scanner;

public class KelvinToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Kelvin: ");
        double k = sc.nextDouble();
        double c = k - 273.15;
        System.out.println("Temperature in Celsius: " + c);
    }
}
