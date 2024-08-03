import java.util.*;
import java.util.Random;
public class CoinToss
{
   public static void main(String [] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.print("How many coin tosses? ");
      int numTosses = scanner.nextInt();
      scanner.close();

        if (numTosses <= 0) {
            System.out.println("Please enter a number more than 0.");
            return;
        }

        int heads = 0;
        int tails = 0;
        Random random = new Random();

        for (int i = 0; i < numTosses; i++) {
            int toss = random.nextInt(2);
            if (toss == 0) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("For " + numTosses + " tosses of a coin, the results are:");
        System.out.println((heads * 100 / numTosses) + "% heads (" + heads + " out of " + numTosses + ")");
        System.out.println((tails * 100 / numTosses) + "% tails (" + tails + " out of " + numTosses + ")");
    }
}

