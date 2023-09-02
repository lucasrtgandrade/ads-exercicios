package javaessentials.repetitionstructure;

import java.util.Scanner;

/*
    Each employee makes $15 an hour
    Receive the number of weekly hours worked for each employee
    and calculate their pay.
    Do not allow for overtime
 */
public class WhileLoop {
    public static void main(String[] args) {

        //1. Initialize know variables
        int payRate = 15;
        int maxHours = 40;

        //2. Get input for unknown variables
        System.out.println("How many hours did the employee work this week");
        Scanner input = new Scanner(System.in);
        double hoursWorked = input.nextDouble();

        //3. Validate input
        while (hoursWorked > maxHours) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = input.nextDouble();
        }

        input.close();

        //4. Calculate
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
