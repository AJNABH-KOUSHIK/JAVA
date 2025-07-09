// WRITE A CODE TO PRINT THE LARGEST NUMBER IN AN ARRAY
public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 45, 2, 90, 33};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Largest = " + max);
    }
}
