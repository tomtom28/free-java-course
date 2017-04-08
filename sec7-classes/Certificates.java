// http://www.homeandlearn.co.uk/java/java_inheritance.html

package section7;

public class Certificates extends StudentResults {
    
    private String certificate;
    
    Certificates() {
        super();
        certificate = "No Certificate Awarded";
    }
    
    String certificateAwarded() {
        
        String grade = this.examGrade();
        
        if (grade.equals("A")) {
            this.certificate = "Certificate of Excellence";
        }
        else if (grade.equals("B") || grade.equals("C")) {
            this.certificate = "Certificate of Achievement";
        }
        else {
            this.certificate = "No Certificate Awarded";
        }
        
        return this.certificate;
        
    }
    
}
