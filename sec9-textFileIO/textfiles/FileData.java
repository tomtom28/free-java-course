package textfiles;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    
    // Declare Path Variable to Read File
    private String path;
    
    // Constructor to set Path Variable
    public ReadFile (String file_path) {
        path = file_path;
    }
    
    // Read the Text File and Return the Words in an Array
    public String[] OpenFile() throws IOException {
        
        // Set Up File Reader & Buffer
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        
        // Initialize Array to Store Read Text
        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];
        
        // Store the Read Text into Array
        for (int i=0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }
        
        // Close out the Reader and Return Array of Words
        textReader.close();
        return textData;
        
    }
    
    // Determine how many lines are in the Text File
    int readLines() throws IOException {
        
        // Set Up File Reader & Buffer
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);
        
        // Initialize line counter
        String aLine;
        int numberOfLines = 0;
        
        // Loop over whole text file and count the lines
        // NOTE: If there's no more lines in a text file, Java returns a value of null.
        while ( ( aLine = bf.readLine() ) != null ) {
            numberOfLines++;
        }
        
        // Close out the Reader and Return the Number of Lines
        bf.close();
        return numberOfLines;
        
    }
    
}
