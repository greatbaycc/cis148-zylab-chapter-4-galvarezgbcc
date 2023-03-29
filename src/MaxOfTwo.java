import java.util.Scanner;

public class MaxOfTwo {

   /* Type your code here. */
   public static int findMax(int n1,int n2){
      if(n1>n2){
         return n1;
      }else{
         return n2;
      }
   }

   public static void main(String args[]) {
      MaxOfTwo maxObject = new MaxOfTwo();
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int max;

      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      max = maxObject.findMax(num1, num2);
      System.out.println("Max: " + max);
   }
}
