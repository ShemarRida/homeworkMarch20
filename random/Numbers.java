package random;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Random randomNum = new Random();
        int randomNum1 = randomNum.nextInt(10);

        while (true){
            System.out.println("Guess a number between 1 through 10");
            int guessNum = userInput.nextInt();

            if(guessNum == randomNum1){
                System.out.println("You win!");
                return;
            }else if (guessNum > randomNum1){
                System.out.println("You are too high. Try again.");
            }else{
                System.out.println("You are too low. Try again.");
            }
        }
    }
}
