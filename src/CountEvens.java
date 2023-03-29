import java.util.Scanner;

public class CountEvens {

   /* Type your code here */
   public static int countEvens(int n1, int n2, int n3, int n4){
      int count = 0;
      if(n1 % 2 == 0)
         count++;
      if(n2 % 2 == 0)
         count++;
      if(n3 % 2 == 0)
         count++;
      if(n4 % 2 == 0)
         count++;
      return count;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      CountEvens labObject = new CountEvens();

      int num1;
      int num2;
      int num3;
      int num4;

      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();

      int result = labObject.countEvens(num1, num2, num3, num4);
      System.out.println("Total evens: " + result);
   }
}


