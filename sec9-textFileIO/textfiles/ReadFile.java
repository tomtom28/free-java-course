// http://www.homeandlearn.co.uk/java/read_a_textfile_in_java.html

package textfiles;

import java.io.IOException;

public class FileData {

    public static void main(String[] args) throws IOException {
        
        // Path to File to be read
        String file_name = "/Users/tommy/Desktop/free-java-course/sec9-textFileIO/ReadThisFile.txt";
        
        // Read File and Output or Print Error
        try {
            
            // Set Up File Reader & Buffer
            ReadFile file = new ReadFile(file_name);
            String[] arrayLines = file.OpenFile();
            
            // Loop over Lines and Print to console
            for ( int i=0; i < arrayLines.length; i++ ) {
                System.out.println( arrayLines[i] );
            }
            
        }
        catch (IOException e) {
            System.out.println("Error! The file was not found...");
            System.out.println( e.getMessage() );
        }
        
    }
    
}
