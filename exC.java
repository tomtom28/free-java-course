// http://www.homeandlearn.co.uk/java/java_switch_statements.html

import java.util.Scanner;

public class IFStatements {

  public static void main(String[] args) {  

    Scanner userInput = new Scanner( System.in );

    int user_age;
    System.out.print("Enter your age: ");
    user_age = userInput.nextInt();

    // Switch Case
    switch (user_age) {

    // 0 to 10
    case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
      System.out.println( user_age + " is between 0 and 10");
      break;

    // 11 to 20
    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
      System.out.println(user_age + " is between 11 and 20");
      break;

    // 21 to 30
    case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
      System.out.println(user_age + " is between 21 and 29");
      break;

    // 30 and over
    default:
      System.out.println("You are over 30. You old bag!");

    }

    System.exit(0);

  }

}
