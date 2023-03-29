import java.util.Scanner;

public class GolfScores {

   public static String golfScore(int p, int s){
      String result;
      if(p == 1 && s == 2)
         return "Error";
      switch(s-p){
         case -2:
            result = "Eagle";
            break;
         case -1:
            result = "Birdie";
            break;
         case 0:
            result =  "Par";
            break;
         case 1:
            result = "Bogey";
            break;
         default:
            result = "Error";
            break;
      }

      return result;
   }

   public static void main(String[] args) {
      GolfScores score = new GolfScores();
      Scanner scnr = new Scanner(System.in);
      int par;
      int strokes;
      String name;

      par = scnr.nextInt();
      strokes = scnr.nextInt();

      name = score.golfScore(par, strokes);

      System.out.println(name);
   }
}
