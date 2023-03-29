import java.util.Scanner;

public class GrayRemoverRGB {
  public static void main(String[] args) {
    /* Type your code here. */
    Scanner scnr = new Scanner(System.in);
    int red = scnr.nextInt();
    int green = scnr.nextInt();
    int blue = scnr.nextInt();

    int smallest = red;

    if(green < smallest)
      smallest = green;
    if(blue < smallest)
      smallest = blue;

    red -= smallest;
    green -= smallest;
    blue -= smallest;
    System.out.println(red + " " + green + " " + blue);

  }
}
