// http://www.homeandlearn.co.uk/java/java_option_panes.html

import javax.swing.JOptionPane;

public class Exercise_A_B {
    
    public static void main(String[] args) {
      
        // Get Breadth
        String breadth;
        breadth = JOptionPane.showInputDialog("Rectangle Breadth");
        
        // Get Height
        String height;
        height = JOptionPane.showInputDialog("Rectangle Height");
        
        // Find Area
        double area = Double.parseDouble( breadth ) * Double.parseDouble( height);
        
        // Return Area
        JOptionPane.showMessageDialog(null, "Area: " + area);
        
        
        // Exit Program
        System.exit(0);
        
    }
    
}