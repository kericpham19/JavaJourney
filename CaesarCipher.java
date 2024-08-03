import java.util.Scanner;
public class CaesarCipher
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner (System.in);
      System.out.print("Enter a message: ");
      String st = scan.nextLine();
      System.out.print("Enter your shift: ");
      int shift = scan.nextInt();
      StringBuilder result = new StringBuilder();
      for(int i = 0; i < st.length(); ++i)
      {
         char alphabet = st.charAt(i);
         if(alphabet >= 'a' && alphabet <= 'z')
         {
            alphabet = (char) (alphabet + shift);
            
            if (alphabet > 'z')
            {
               alphabet = (char) (alphabet - 26);
            }
            
            else if (alphabet >= 'A' && alphabet <= 'Z');
            {
               alphabet = (char) (alphabet + shift);
               
               if (alphabet > 'Z')
               {
                 alphabet = (char) (alphabet - 26);
               }
            }
         }
         result.append(alphabet);
      }      
      System.out.println("msg: " + st);
      System.out.println("cipher: " + result);
   }
}