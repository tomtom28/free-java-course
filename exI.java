// http://www.homeandlearn.co.uk/java/arrays_and_strings.html

package arrayloops;

public class ArrayLoops {

    public static void main(String[] args) {

      int[] myArray = new int[] {23, 6, 47, 35, 2, 14};
      
      // Print Only Odd Numbers in Array
      System.out.println("Your Odd Numbers are...");
      for (int i = 0; i < myArray.length; i++) {
          if (myArray[i]%2 == 1) {
              System.out.println(myArray[i]);
          }
      }
    
    }

}
