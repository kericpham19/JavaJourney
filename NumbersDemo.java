import javax.swing.*;
public class NumbersDemo
{
   public static void main(String []args)
   {
      int num1, num_twice, num_plusfive, num_square;
      
      String output;
      
      num1 = inputMethod();
      
      num_twice = displayTwiceTheNumber(num1);
      num_plusfive = displayNumberPlusFive(num1);
      num_square = displayNumberSquared(num1);
      
      output = "Number is: " + num1 + "\n" + 
               "It's twice is: " + num_twice + "\n" + 
               "Addition of 5 is: " + num_plusfive + "\n" + 
               "Its square is: " + num_square;
      
      outputMethod(output); 
   }
   
   public static int displayNumberSquared(int num1)
   {  
      return num1 * num1;
   }
   
   public static int displayNumberPlusFive(int num1)
   {
      return num1 + 5;
   }
   
   public static int displayTwiceTheNumber(int num1)
   {
      return num1 + num1;
   }
   
   public static int inputMethod()
   {
      String input;
      int number;
      input = JOptionPane.showInputDialog(null, "Enter your number: ");
      number = Integer.parseInt(input);
      return number;
   }
   
   public static void outputMethod(String msg)
   {
      JOptionPane.showMessageDialog(null,msg);
   }
        
}