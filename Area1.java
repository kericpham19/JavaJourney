import javax.swing.JOptionPane;
public class Area1
{
   public static void main (String [] args)
   {
      double radius;
      double area;
      String input;
      
      input = JOptionPane.showInputDialog(null, "Enter the radius");
      radius = Double.parseDouble(input);
      
      area = 3.14 * radius * radius;
      
      JOptionPane.showMessageDialog(null, "The area of a circle with radius " + radius + " is " + area); 
   }
}