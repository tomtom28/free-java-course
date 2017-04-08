// http://www.homeandlearn.co.uk/java/arrays_and_strings.html

package arrayloops;

// Needed for Array Sorting (ASC order only)
import java.util.Arrays;

public class ArrayLoops {

    public static void main(String[] args) {

        // Set up an array to hold the following values, and in this order: 23, 6, 47, 35, 2, 14
        int[] myArray = new int[] {23, 6, 47, 35, 2, 14};
        
        // Sort Array in ASC Order
        Arrays.sort(myArray);
        
        // Highest Number is at the end of the Array (length minus one)
        int highestNumber = myArray[myArray.length - 1];
        
        // Print result
        System.out.println(highestNumber);
        
    }
    
}
