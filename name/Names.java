package name;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);




        while (true) {

            System.out.println("What is your name?");
            String userName = userInput.next();

            if (userName.equalsIgnoreCase("Alice") || userName.equalsIgnoreCase("Bob")) {
                System.out.println("Welcome " + userName);
                return;
            }
            }
        }

    }

