public class CodeCleadup
{
   public static void main (String [] args)
   {
       int arr[]={1,2,3,4,5,6,7,8,9,10};
       displayArr(arr);
       displayArrInReverseOrder(arr);
       int sum=calcualteSum(arr);
       displayValuesLessThan(arr, 7);
       smallLargeAverage(arr);
   }
   
   public static void displayArr(int[] arr) 
   {
      System.out.print("All the integers: ");
      for(int i=0;i<arr.length;i++)
      {
         System.out.print(arr[i] + " ");
      }
   }
   
   public static void displayArrInReverseOrder(int[] arr) 
   {
      System.out.println(" ");
      System.out.print("Integers in reverse order: ");
      for(int i=9;i>=0;i--)
      {
         System.out.print(arr[i] + " ");
      }
   }
   
   public static int calcualteSum(int[] arr) 
   {
      System.out.println(" ");
      int sum=0;
      for(int i=0;i<arr.length;i++)
      {
         sum+=arr[i];
      }
      System.out.print("The Sum of the integer in the array is: " + sum);
      return sum;
   }
   
   public static void displayValuesLessThan(int[] array, int limit) 
   {
       System.out.println("\nValues less than a limiting argument " + limit + ":");
        for (int num : array) 
        {
            if (num < limit) 
            {
               System.out.print(num + " ");
            }
        }
        System.out.println();
   }

   public static void smallLargeAverage(int[] array)
   {
      int smallest = array[0];
      int largest = array[0];
      int sum = 0;
      
      for(int num: array)
      {
         if(num < smallest)
         {
            smallest = num;
         }
         if(num > largest)
         {
            largest = num;
         }
         sum += num;
      }
      double average = (double) sum / array.length;

      System.out.print("Smallest: " + smallest + " Largest: " + largest + " Average: " + average);
   }      
}