// PRINT AVERAGE OF DIFFERENT AGES
public class AverageAges {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 37, 70}; // Array of ages
        float avg, sum = 0; // Sum and average
        int length = ages.length; // Find length of array

        // Use for-each loop to add up all ages
        for (int age : ages) {
            sum = sum + age; // Add each age to sum
        }

        avg = sum / length; // Calculate average
        System.out.println("The average age is: " + avg); // Print average
    }
}

// Output: The average age is: 34.5  (Note: actual value depends on sum)
