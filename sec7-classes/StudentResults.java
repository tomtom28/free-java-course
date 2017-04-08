// http://www.homeandlearn.co.uk/java/accessing_class_variables.html

package section7;

public class StudentResults {
    
    // Make field variables private
    private String Full_Name;
    private String Exam_Name;
    private int Exam_Score;
    private String Exam_Grade;
    
    // Use class constructor to assign default values to field variables
    StudentResults() {
        
        Full_Name = "No Student Name Given";
        Exam_Name = "No Exam Name Given";
        Exam_Score = 0;
        Exam_Grade = "Unknown";

    }
    
    // Set/Get Student Name
    String fullName(String name) {
        Full_Name = name;
        return Full_Name;
    }
    
    // Set/Get Exam Name
    String examName(String examCode) {
        
        if ( examCode.equals("VB") ){
            Exam_Name = "Visual Basic .NET";
        }
        else if ( examCode.equals("JV") ) {
            Exam_Name = "Java";
        }
        else if ( examCode.equals("C#") ) {
            Exam_Name = "C# .NET";
        }
        else if ( examCode.equals("PH") ) {
            Exam_Name = "PHP";
        }
        else {
            Exam_Name = "No Exam Selected!";
        }
        
        return Exam_Name;
        
    }
    
    // Set/Get Score
    String examScore(int grade) {
        Exam_Score = grade;
        return Exam_Score + " out of 100";
    }
    
    // Set/Get Grade
    String examGrade(){
       
        int score = Exam_Score;
        String grade;
        
        if ( score < 60) {
            grade = "F";
        }
        else if ( score >= 60 && score < 70) {
            grade = "D";
        }
        else if ( score >= 70 && score < 80 ) {
            grade = "C";
        }
        else if ( score >= 80 && score < 90 ) {
            grade = "B";
        }
        else {
            grade = "A";
        }
        
        Exam_Grade = grade;
        
        return Exam_Grade;
        
    }
    
    
}
