package grades;

import java.util.Random;
import java.util.Scanner;

public class RandomGrade {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int randomNum1 = randomNum.nextInt(100);
        System.out.println(randomNum1);

        if( randomNum1 >= 90){
            System.out.println("You got an A");
        }else if (randomNum1 <= 89 && randomNum1 >= 80){
            System.out.println("You got a B");
        }else if (randomNum1 <= 79 && randomNum1 >= 70){
            System.out.println("You get a C");
        }else if (randomNum1 <= 69 && randomNum1 >= 60){
            System.out.println("You get a D");
        }else {
            System.out.println("You print!");
        }


    }
}
