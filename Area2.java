import javax.swing.*;
public class Area2
{
   public static void main(String [] args)
   {
      double radius, area, circumference;
      
      radius = inputValue();
      area = Area(radius);
      circumference = Circumference(radius);
      display(radius, area, circumference);
   }
   
   public static double inputValue()
   {
      String input;
      double r;
      input = JOptionPane.showInputDialog(null, "Enter your radius");
      r = Double.parseDouble(input);
      return r;
   }
   
   public static double Area(double r)
   {
      double area;
      area = 3.14 * r * r;
      return area;
   }
   
   public static double Circumference(double r)
   {
      double circum;
      circum = 2 * 3.14 * r;
      return circum;
   }
   
   public static void display(double r, double a, double c)
   {
      JOptionPane.showMessageDialog(null, "A circle with radius " + r + " \n Area = " + a + "\n Circumference = " + c);
   }
}