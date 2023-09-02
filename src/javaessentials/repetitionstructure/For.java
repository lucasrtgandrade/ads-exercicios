package javaessentials.repetitionstructure;

/*
    Write a cashier program that will scan a given number of items and tally the cost
 */

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        //Get number of items to scan
        System.out.println("Enter the number of items you would you like to scan");
        Scanner input = new Scanner(System.in);

        int quantity = input.nextInt();

        double total = 0;

        //Create for loop to iterate through all the items and accumulate the cost
        for(int i=0; i<quantity; i++) {
            System.out.println("Enter the cost of the item: ");
            double price = input.nextDouble();

            total = total + price;
        }

        input.close();
        System.out.println("Your total is $" +total);
    }
}
