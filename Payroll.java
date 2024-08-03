import java.util.Scanner;
public class Payroll
  {
   public static void main(String []args)
   {
        Scanner input = new Scanner(System.in);

        double[] hourlyPayRates = {17.00, 20.00, 22.00};
        
        System.out.print("Enter skill level (1, 2, 3): ");
        
        int skillLevel = input.nextInt();

        if (skillLevel < 1 || skillLevel > 3) 
        {
            System.out.println("Invalid skill level. Please enter 1, 2, or 3.");
            return;
        }

        System.out.print("Enter hours worked: ");
        
        int hoursWorked = input.nextInt();

        double grossPay;
        
        if (hoursWorked <= 40) 
        {
            grossPay = hoursWorked * hourlyPayRates[skillLevel - 1];
        } else {
            grossPay = 40 * hourlyPayRates[skillLevel - 1]
                    + (hoursWorked - 40) * 1.5 * hourlyPayRates[skillLevel - 1];
        }


        double netPay = grossPay;

        System.out.printf("Your net pay for Level " + skillLevel + " with " + hoursWorked + " hours is $" + netPay);

        input.close();
    }
}

  