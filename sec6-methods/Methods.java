// http://www.homeandlearn.co.uk/java/java_method_parameters_part2.html

package section6;

import java.util.Scanner;

// Swap first 2 char of firstname with first 2 char of lastname
public class Methods {

    public static void main(String[] args) {
               
        // Import MyMethods class
        MyMethods myMethod = new MyMethods();
        
        // Call the doubleIt function attached to the myMethods class
        int number = myMethod.doubleIt(4);
        System.out.println(number);
        
        // Call the sublime function attached to the myMethods class
        myMethod.callMeSublime("Tommy");
                
    }
    
}
