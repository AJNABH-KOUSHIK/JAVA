// PRINT LOWEST NUMBER IN THE ARRAY
public class LowestAge {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70}; // Array of ages
        int length = ages.length;
        int lowestAge = ages[0]; // Assume first is lowest

        // Use for-each to find lowest age
        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age; // Replace lowestAge if smaller found
            }
        }

        System.out.println("The lowest age is: " + lowestAge);
    }
}

// Output: The lowest age is: 18
