// LOOP THROUGH MULTI DIMENSIONAL ARRAY
public class MultiDimensionalArrayLoop {
    public static void main(String[] args) {
        int[][] myNumbers = {
            {1, 2, 3, 4},
            {5, 6, 7}
        };

        // Outer loop for rows
        for (int i = 0; i < myNumbers.length; i++) {
            // Inner loop for columns in current row
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]); // Print each element
            }
        }
    }
}

// Output:
// 1
// 2
// 3
// 4
// 5
// 6
// 7
