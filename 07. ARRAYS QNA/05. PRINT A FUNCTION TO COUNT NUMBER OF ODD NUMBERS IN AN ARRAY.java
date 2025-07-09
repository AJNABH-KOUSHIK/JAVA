// WRITE A CODE TO PRINT A FUNCTION TO COUNT NUMBER OF ODD NUMBERS IN AN ARRAY
public class CountOddInArray {
    static int countOdds(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Odd numbers count = " + countOdds(arr));
    }
}
