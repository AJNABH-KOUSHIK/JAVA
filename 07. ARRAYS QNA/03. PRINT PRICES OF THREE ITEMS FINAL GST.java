// WRITE A CODE TO PRINT PRICES OF THREE ITEMS FINAL GST
import java.util.Scanner;

public class Q35_CostWithGST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] prices = new double[3];
        double gstRate = 0.18;
        double total = 0;

        System.out.println("Enter prices of 3 items:");
        for (int i = 0; i < 3; i++) {
            prices[i] = sc.nextDouble();
            total += prices[i];
        }

        double gst = total * gstRate;
        double finalCost = total + gst;

        System.out.println("Total = " + total);
        System.out.println("GST (18%) = " + gst);
        System.out.println("Final Cost = " + finalCost);
    }
}
