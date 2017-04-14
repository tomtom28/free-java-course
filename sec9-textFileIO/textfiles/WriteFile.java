package textfiles;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
    
    private String path;
    private boolean append_to_file = false;
    
    public WriteFile(String file_path) { 
        path = file_path;
    }
    
    public WriteFile(String file_path, boolean append_value) {
        path = file_path;
        append_to_file = append_value;
    }
    
    public void writeToFile(String textLine) throws IOException {
        
        // Set Up File Writer & Printer
        FileWriter write = new FileWriter(path, append_to_file);
        PrintWriter print_line = new PrintWriter(write);
        
        // Close out the Printer
        print_line.printf("%s" + "%n", textLine);
        print_line.close();
        
    }
    
}
