// http://www.homeandlearn.co.uk/java/class_constructor.html

package section7;

public class ExamDetails {
    
    public static void main(String[] args) {
        
        
        // Create a new StudentResults object 
        // StudentResults student1 = new StudentResults();
        Certificates student1 = new Certificates();
        
        
        // Set values of object
        String stud1Name = student1.fullName("Tommy Tom");
        String stud1ExamName = student1.examName("JV");
        String stud1Score = student1.examScore(92);
        String stud1Grade = student1.examGrade();
        
        
        // Print values of object
        System.out.println("Student Name: " + stud1Name);
        System.out.println("Exam Name: " + stud1ExamName);
        System.out.println("Exam Score: " + stud1Score);
        System.out.println("Exam Grade: " + stud1Grade);
        
        
        // Determine if Certificate was given
        String award = student1.certificateAwarded();
        System.out.println(award);
        
    }
    
}
