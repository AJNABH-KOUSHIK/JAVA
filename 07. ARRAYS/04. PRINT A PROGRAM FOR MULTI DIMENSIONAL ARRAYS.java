// WRITE A CODE TO PRINT A PROGRAM FOR MULTI DIMENSIONAL ARRAYS
public class Q37_MultidimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
