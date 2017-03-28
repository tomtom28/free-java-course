// http://www.homeandlearn.co.uk/java/java_switch_statements.html

import java.util.Scanner;

public class IFStatements {

  public static void main(String[] args) {  

    Scanner userInput = new Scanner( System.in );
    
    String color;
    System.out.println("Choose a color: Black, Blue, White, Red");
    color = userInput.next();
    
    
    // BLACK "You must be a Goth!"
    if ( color.equals("Black") ) {
        System.out.println("You must be a Goth!");
    }
    // BLUE "You're not a Chelsea fan, are you?"
    else if ( color.equals("Blue") ) {
        System.out.println("You're not a Chelsea fan, aren't you?");
    }
    // RED "You are fun and outgoing"
    else if ( color.equals("Red") ) {
        System.out.println("You are fun and outgoing");
    }
    // WHITE "You are a very pure person"
    else if ( color.equals("White") ) {
        System.out.println("You are a very pure person");
    }
    else {
        System.out.println("Please capitalize input and select one of the options.");
    }

    System.exit(0);

  }

}
