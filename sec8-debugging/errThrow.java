// http://www.homeandlearn.co.uk/java/java_error_handling.html

package section8;

public class errThrow {

    public static void main(String[] args) {
        
        // Basic Try-Catch. Note that "Exception" is a catch all.
        // Java has special expection types depending on the error (in this case, ArithmeticException)
        try {
            int x = 10;
            int y = 0;
            int z = x/y;
        }
        catch (Exception err) {
            System.out.println( err.getMessage() );
            System.out.println( err ); // also works
        }

    }
    
}
