import java.util.Scanner;
public class WorkBasedLearning
{
   public static void main(String [] args)
   {
      /* Meadowdale Dairy Farm sells organic brown eggs to local customers.  They charge 
      $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen.  
      Write a class that prompts a user for the number of eggs in the order and then 
      display the amount owed with a full explanation. */
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to Meadowdale Dairy Farm");
      System.out.println("How many eggs would you like to order? ");
      int totalEggs = scan.nextInt();
      
      int dozens = totalEggs / 12;
      int looseEggs = totalEggs % 12;
      
      double dozenPrice = 3.25;
      double loosePrice = .45;
      double totalCost = (dozens * dozenPrice) + (looseEggs * loosePrice);
      
      System.out.println("You ordered " + totalEggs + "eggs. \nThats " + dozens + " dozens at $" + dozenPrice + " per dozen and " + looseEggs + " at " + loosePrice + " cents each. \nYour total is $" + totalCost);
      
      
      
   }
}