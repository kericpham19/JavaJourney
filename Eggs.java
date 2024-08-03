import java.util.*;

public class Eggs 
{
   public static void main(String []args)
   {
      Scanner scan = new Scanner(System.in);
      
      int Eggs,dozens,looseEggs;
      
      double total,dozenCost,remCost;
      
      System.out.print(" Welcome to Meadowdale Dairy farm \nHow many eggs would you like to order? ");
      
      Eggs = scan.nextInt();
      
      dozens = Eggs / 12; 
      
      looseEggs = Eggs % 12 ; 
      
      dozenCost = dozens * 3.25;
      
      remCost = looseEggs * .45;
      
      total = dozenCost + remCost;
      
      System.out.println("You ordered " + Eggs + " eggs.");
       
      System.out.println("That's " + dozens + " dozen at $3.25 per dozen and " + looseEggs + " loose eggs at 45 cents each.");
      
      System.out.println("Your total is $" + total);  
        
   }
      
     
}