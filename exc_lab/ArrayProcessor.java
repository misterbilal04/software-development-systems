public class ArrayProcessor {

    // Method to get the length of the array without using a.length
    public int getArrayLength(Object[] a) {
        int count = 0;
        try {
            // Keep iterating through the array until an exception is thrown
            while (true) {
                Object t = a[count];  // Try to access the array element at index 'count'
                count++;              // Increment the counter
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // When exception is thrown, terminate the loop and return the count
            System.out.println("ArrayIndexOutOfBoundsException caught! Array size found.");
        }
        return count;  // Return the count, which is the array length
    }
}
