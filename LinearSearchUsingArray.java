 
import java.util.Scanner;
class LinearSearchExample
{
   public static void main(String args[])
   {
      int index , size, target , array[];
      //To capture user input
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      size = input.nextInt(); 
      //Creating array to store the all the numbers
      array = new int[size]; 
      System.out.println("Enter " + size + " integers");
      //Loop to store each numbers in array
      for (index = 0; index < size; index++)
        array[index] = input.nextInt();

      System.out.println("Enter the search value:");
      target = input.nextInt();

      for (index = 0; index < size; index++)
      {
         if (array[index] == target) 
         {
           System.out.println(target+" is present at location "+(index+1));
           /*Item is found so to stop the search and to come out of the 
            * loop use break statement.*/
           break;
         }
      }
      if (index == size)
        System.out.println(target + " doesn't exist in array.");
   }
}


  /*Time Complexity of This Program.

     Approach 1

    Best Case = Number Of Iteration=1
    Worst Case = Number Of Iteration=n+1
    Avg Case = Number of Iteration=(n+2)/2
     
        Time Complexity = O(n).
        
      Approach 2
      
      Recursion RElation.
      
      T(n) = T(n-1)+1
      T(1)=1
      Time Complexity =O(n).*/
