// WRITW A CODE IF A CHARACTER IS UPPER CASE 
import java.util.Scanner;

public class UpperCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println("Uppercase");
        } else {
            System.out.println("Not Uppercase");
        }
    }
}
