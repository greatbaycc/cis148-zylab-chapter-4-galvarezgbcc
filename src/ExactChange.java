import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int pennies = scnr.nextInt();

        if(pennies <1){
            System.out.println("No change");
        }else{
            if(pennies >= 100){
                int dollars = pennies/100;
                String d = "Dollar";
                if(dollars > 1)
                    d += "s";
                System.out.println(dollars + " " + d);
                pennies %= 100;
            }
            if(pennies >= 25){
                int quarters = pennies/25;
                String q = "Quarter";
                if(quarters > 1)
                    q += "s";
                System.out.println(quarters + " " + q);
                pennies %= 25;
            }
            if(pennies >= 10){
                int dimes = pennies/10;
                String d = "Dime";
                if(dimes > 1)
                    d += "s";
                System.out.println(dimes + " " + d);
                pennies %= 10;
            }
            if(pennies >= 5){
                int nickels = pennies/5;
                String n = "Nickel";
                if(nickels > 1)
                    n += "s";
                System.out.println(nickels + " " + n);
                pennies %= 5;
            }
            if(pennies >=1){
                if(pennies == 1){
                    System.out.println("1 Penny");
                }else{
                    System.out.println(pennies + " " + "pennies");
                }
            }
        }
    }
}
