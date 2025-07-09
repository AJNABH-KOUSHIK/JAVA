// WRITE A CODE TO PRINT 1 TO 10 EXCEPT 6
public class Print1To10Except6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) continue;
            System.out.print(i + " ");
        }
    }
}
