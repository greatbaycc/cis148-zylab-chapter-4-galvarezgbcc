import java.util.Scanner;

public class FunWithCharacters {

   public static String checkCharacter(String s, int i){

      char c = s.charAt(i);
      if(Character.isLetter(c))
         return "Character '" + c + "' is a letter";
      if(Character.isWhitespace(c))
         return "Character '" + c + "' is a white space";
      if(Character.isDigit(c))
         return "Character '" + c + "' is a digit";
      return "Character '" + c + "' is unknown";
   }

   public static void main(String[] args) {

      FunWithCharacters labObject = new FunWithCharacters();
      String word = "happy birthday"; // Set string
      int index = 2; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));

      index = 5; // Set specified index to 5
      System.out.println(labObject.checkCharacter(word, index));

      word = "happy birthday 2 you";
      index = 15; // Set specified index to 15
      System.out.println(labObject.checkCharacter(word, index));

      word = "happy birthday!";
      index = 14; // Set specified index to 14
      System.out.println(labObject.checkCharacter(word, index));
   }
}
