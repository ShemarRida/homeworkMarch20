package coins;

import java.util.Scanner;

public class Quantities {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        float penny = .01f;
        float nickel = .05f;
        float dime = .10f;
        float quarter = .25f;
        System.out.println("How many pennies would you like?");
        float amountPennies = userInput.nextFloat();
        System.out.println("How many nickels would you like?");
        float amountNickels = userInput.nextFloat();
        System.out.println("How many dimes would you like?");
        float amountDimes = userInput.nextFloat();
        System.out.println("How much quarters would you like?");
        float amountQuarters = userInput.nextFloat();

        float amountOfAll = ((penny * amountPennies) + (nickel * amountNickels) + (dime * amountDimes) + (quarter *amountQuarters));

        if(amountOfAll == 1.00){
            System.out.println("You win");
        }else if(amountOfAll > 1.00){
            System.out.println("You are more than a dollar by " + (amountOfAll - 1.00));
        }else {
            System.out.println("You are less than a dollar by " + (1.00 - amountOfAll));
        }

    }
}
