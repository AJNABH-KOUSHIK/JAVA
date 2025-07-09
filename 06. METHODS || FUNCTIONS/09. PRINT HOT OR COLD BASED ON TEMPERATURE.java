// WRITE A CODE TO PRINT HOT OR COLD BASED ON TEMPERATURE
import java.util.Scanner;

public class Q32_HotOrCold {
    static void checkTemp(int temp) {
        if (temp >= 30) System.out.println("Hot");
        else System.out.println("Cold");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        checkTemp(t);
    }
}
