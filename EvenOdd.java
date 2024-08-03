import java.util.Scanner;
public class EvenOdd
{
   public static void main(String []args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("User enters ");
      
      int number = scan.nextInt();
      
      if (number < 0){
         System.out.println("Number must be postive!");
         }
         
      else if(number%2 == 0){
            System.out.println(number + " is an even number");
            }
      
      else{
         System.out.println(number + " is an odd number");
         }     
   }
}