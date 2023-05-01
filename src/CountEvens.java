import java.util.Scanner;

public class CountOdds {

   /* It counts odds now */
   public static int countOdds(int n1, int n2, int n3, int n4){
      int count = 0;
      if(n1 % 2 == 1)
         count++;
      if(n2 % 2 == 1)
         count++;
      if(n3 % 2 == 1)
         count++;
      if(n4 % 2 == 1)
         count++;
      return count;
   }
/* I changed CountEvens to CountOdds */
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      CountOdds labObject = new CountOdds();

      int num1;
      int num2;
      int num3;
      int num4;

      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();

      int result = labObject.countOdds(num1, num2, num3, num4);
      System.out.println("Total odds: " + result);
   }
}


