import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // takes input from the user 2 times num1 and num2
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        //Output
        System.out.println("Sum = " + sum);
    }
}
