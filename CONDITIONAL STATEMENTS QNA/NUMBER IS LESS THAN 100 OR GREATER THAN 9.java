// WRITE A CODE IF A NUMBER IS LESS THAN HUNDRED OR GREATER THAN NINE
import java.util.Scanner;

public class Between10And99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num > 9 && num < 100) {
            System.out.println(num + " is between 10 and 99");
        } else {
            System.out.println(num + " is not between 10 and 99");
        }
    }
}
