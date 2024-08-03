import java.util.Scanner;
public class IfElseStatement
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a grade:");
      
      int n = scan.nextInt();
      System.out.println(n);
      
      if (n >= 90 && n <= 100) {
            System.out.println("A"); 
            }         
   }
}