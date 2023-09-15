package javaessentials.repetitionstructure;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int runAgain;
        do {
            // 1. Generate random number
            Random ganerateRandom = new Random();
            int upperbound = 101;
            int randomNumber = ganerateRandom.nextInt(upperbound);
            System.out.println(randomNumber);
            //2. Receive users guess
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number from 0 to 100");
            int guess = input.nextInt();
            while (guess != randomNumber) {
                if (guess > randomNumber) {
                    System.out.println("You've guessed too high");
                    System.out.println("Enter a number from 0 to 100");
                    guess = input.nextInt();
                } else {
                    System.out.println("You've guessed too low");
                    System.out.println("Enter a number from 0 to 100");
                    guess = input.nextInt();
                }
            }
            // Score
            System.out.println("Bulls Eye!");
            System.out.println("Would you like to play again?\nEnter 1 for yes, 2 for no");
            runAgain = input.nextInt();
        }while (runAgain == 1);
        System.out.println("Thanks for playing");
    }
}
