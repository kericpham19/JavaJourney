public class StudentScores
{
   public static void main(String [] args)
   {
      String [] studentNames = {"Morgan", "Hardy", "Koe", "Lainey"};
      int[][] testScores = { {85, 91, 95, 97},
                             {86, 87, 88, 89},
                             {90, 92, 94, 96},
                             {99, 93, 98, 83} };
      for(int i = 0; i < studentNames.length; i++)
      {
         String studentName = studentNames[i];
         int[] scores = testScores[i];
         double averageScore = calculateAverage(scores);
         
         System.out.println(studentName + " average test score: " + averageScore);
      }  
   }
   
   public static double calculateAverage(int [] scores) 
   {
      int sum = 0;
      for(int score : scores)
      {
         sum += score;
      }
      return (double) sum / scores.length;
   }
}