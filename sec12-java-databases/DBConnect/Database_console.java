// http://www.homeandlearn.co.uk/java/connect_to_a_database_using_java_code.html

// THIS REQUIRES A SQL TABLE CREATED IN jdbc:derby://localhost:1527/EmployeeDB


package DBConnect;

// Import SQL Packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;
import java.sql.ResultSet;

// Needed to Manually add Derby Client Driver for DB Connection (derbyclient.jar)
// RUN THIS IN TERMINAL... echo $(/usr/libexec/java_home)
// GIVES PATH TO JAVA FOLDER... /Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home


public class Database_console {

    public static void main(String[] args) {
        
        try {
            // Connect to SQL Database
            String host = "jdbc:derby://localhost:1527/EmployeeDB";
            String userName = "app";
            String password = "app";
            Connection con = DriverManager.getConnection( host, userName, password );
            
            // SQL Query
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM Workers";
            ResultSet rs = stmt.executeQuery(SQL);
            
            // Loop over the query ResultSet
            while ( rs.next() ) {
                
                // Get Fields of Current ResultSet Row
                int id_col = rs.getInt("ID");
                String first_name = rs.getString("First_Name");
                String last_name = rs.getString("Last_Name");
                String job = rs.getString("Job_Title");
                
                // Print Fields
                String p = id_col + " | " + first_name + " " + last_name + " | " + job;
                System.out.println(p);
                
            }
            
        }
        catch (SQLException err) {
            System.out.println( err.getMessage() );
        }


        
    }
    
}
