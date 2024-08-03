import javax.swing.JOptionPane;

public class Password {
   public static void main(String [] args) {
      String password = "";
      boolean validLength = false;
      boolean validLetter = false;
      boolean validDigit = false;
      String invalid = "";
      String directions = "Time to update your password \n" + 
                           "Your password must contain at least: \n" +
                           "      8 characters \n" +
                           "      1 letter \n" +
                           "      1 digit \n\n" +
                           "Please enter your password: ";
      
      while(!validLength || !validLetter || !validDigit) {
         password = JOptionPane.showInputDialog(null, invalid + directions);
         
         validLength = checkLength(password);
         validLetter = checkLetter(password);
         validDigit = checkDigit(password);
         
         invalid = "";
         if(!validLength)
            invalid += "Needs to be at least 8 characters\n";
         if(!validLetter)
            invalid += "Needs at least 1 letter\n";
         if(!validDigit)
            invalid += "Needs at least 1 number\n";         
      }
      JOptionPane.showMessageDialog(null,"The password is valid (" + password + ")");
   } 
   
   public static boolean checkLength(String password) {
      return password.length() >= 8;
   } 
   
   public static boolean checkLetter(String password) {
      for(int i = 0; i < password.length(); i++) {
         if(Character.isLetter(password.charAt(i))) {
            return true;
         }
      }
      return false;
   }
   
   public static boolean checkDigit(String password) {
      for(int i = 0; i < password.length(); i++) {
         if(Character.isDigit(password.charAt(i))) {
            return true;
         }
      }
      return false;
   }
}
