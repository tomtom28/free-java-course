// http://www.homeandlearn.co.uk/java/logic_errors.html

package section8;

public class debugger {

    public static void main(String[] args) {
        
        // Fixed in Debugger. Refer to website for info
        int LetterCount = 0;
        String check_word = "Debugging";
        String single_letter = "";
        
        for (int i = 0; i < check_word.length(); i++) {
            single_letter = check_word.substring(i,i+1);
            if (single_letter.equals("g")) {
                LetterCount++;
            }
                
        }
        
        System.out.println("G was found " + LetterCount + " times.");

    }
    
}
