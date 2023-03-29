import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();

        int min = num1;

        if(num2<min)
            min = num2;

        if(num3<min)
            min = num3;

        System.out.println(min);
    }
}
