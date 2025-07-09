// WRITE A CODE TO PRINT NAMASTE IF INDIAN AND BONJOUR IF FRENCH
import java.util.Scanner;

public class GreetingBasedOnNationality {
    static void greet(String nationality) {
        if (nationality.equalsIgnoreCase("Indian")) {
            System.out.println("Namaste");
        } else if (nationality.equalsIgnoreCase("French")) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        greet(input);
    }
}
