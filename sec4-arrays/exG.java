// http://www.homeandlearn.co.uk/java/arrays_and_strings.html

package arrayloops;

public class ArrayLoops {

    public static void main(String[] args) {
        
        // Set up an array to hold the following values, and in this order: 23, 6, 47, 35, 2, 14
        int[] myArray = new int[] {23, 6, 47, 35, 2, 14};
        
        // Write a programme to get the average of all 6 numbers.
        double average;
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        average = sum/myArray.length;
        
        // Display output
        System.out.println(average);
        
    }
    
}