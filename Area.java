import java.util.Scanner;

public class Area
{
   public static void main(String [] args)
   {
      int radius;
      double area;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your radius: ");
      radius = input.nextInt();
      
      area = 3.14 * radius * radius;
      
      System.out.println("Area of circle with radius " + radius + " is " + area);
   }
}