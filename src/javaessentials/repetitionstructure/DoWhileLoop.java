package javaessentials.repetitionstructure;

import java.util.Scanner;

/*
    Receive two number from the user and the sum the two numbers.
    The user should be able to repeat this action until they indicate they are done.
 */
public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int runAgain;

        do {
            System.out.println("Enter first number: ");
            double number01 = input.nextDouble();

            System.out.println("Enter second number");
            double number02 = input.nextDouble();

            double sum = number01 + number02;
            System.out.println("The sum is: " + sum);

            System.out.println("Would you like to start over? Enter 1 for yes, 2 for no");
            runAgain = input.nextInt();
        } while (runAgain == 1);
    }
}
