// WRITE A CODE TO PRINT A 2D ARRAY STORING TABLES OF 2 AND 3
public class ables2DArray {
    public static void main(String[] args) {
        int[][] table = new int[2][10];

        for (int i = 0; i < 10; i++) {
            table[0][i] = 2 * (i + 1);
            table[1][i] = 3 * (i + 1);
        }

        for (int i = 0; i < 2; i++) {
            System.out.print("Table of " + (i + 2) + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
