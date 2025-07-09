// WRITE A CODE TO PRINT A FUNCTION TO PRINT A REVERSE OF AN ARRAY
public class ReverseArray {
    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
