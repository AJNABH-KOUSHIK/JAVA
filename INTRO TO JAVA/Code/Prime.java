import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
        } else if (n == 2 || n == 3 || n == 5 || n == 7) {
            System.out.println("Prime");
        } else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}
