package company;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int expectedSalary = 80000;
        int expectedYearsWorking = 3;

            System.out.println("Whats is your salary?");
            int salary = userInput.nextInt();
            System.out.println("How long have you been working?");
            int yearsWorking = userInput.nextInt();

            if(salary >= expectedSalary && yearsWorking >= expectedYearsWorking){
                System.out.println("You qualify");
            }else if (salary < expectedSalary){
                System.out.println("You have $" + (expectedSalary - salary) + " left to qualify for a loan.");
            }else {
                System.out.println("You need to work for " + (expectedYearsWorking - yearsWorking) + " more year/s");
            }

        }

    }

