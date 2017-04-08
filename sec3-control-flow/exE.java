// http://www.homeandlearn.co.uk/java/java_for_loops.html

import java.util.Scanner;

public class ForLoop {

  public static void main(String[] args) {

    Scanner userInput = new Scanner( System.in );

    int number;
    System.out.print("Enter a number: ");
    number = userInput.nextInt();

    for (int i = 1; i <= number; i++) {
      System.out.println(i + " times " + number + " equals " + i*number);
    }       

  }
    
}
