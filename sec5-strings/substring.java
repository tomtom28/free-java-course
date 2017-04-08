// http://www.homeandlearn.co.uk/java/substring.html

import java.util.Scanner;

// Swap first 2 char of firstname with first 2 char of lastname
public class Methods {

    public static void main(String[] args) {
        
        // Get user's full name
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write your first and last name: ");
        String fullName = userInput.nextLine();
        fullName = fullName.trim();
        
        // Parse fullname to get firstname and lastname
        int spacePosition = fullName.indexOf(" ");
        String firstName = fullName.substring(0, spacePosition);
        String lastName = fullName.substring( (spacePosition + 1), fullName.length() );
        
        // Parse first 2 letters of first / last names
        String firstNameChars = firstName.substring(0,2);
        String lastNameChars = lastName.substring(0,2);
        
        // Swap first 2 letters in last name and first name
        firstName = lastNameChars + firstName.substring( 2, firstName.length() );
        lastName = firstNameChars + lastName.substring( 2, lastName.length() );
        
        
        // Print out new name string
        String newFullName = firstName + " " + lastName;
        System.out.println("\n" + "Too bad, I will call you: ");
        System.out.println(newFullName);
        
        
    }
    
}
