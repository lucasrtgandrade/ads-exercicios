package exercicios;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Enter quantities of coins
        System.out.println("How many pennies you would like?");
        float pennies = input.nextFloat();

        System.out.println("How many nickels you would like?");
        float nickels = input.nextFloat();

        System.out.println("How many dimes you would like?");
        float dimes = input.nextFloat();

        System.out.println("How many quarters you would like?");
        float quarters = input.nextFloat();

        //2. Count total

        /*
        float penniesTotal = pennies * 0.01f;
        float nickelsTotal = nickels * 0.05f;
        float dimesTotal = dimes * 0.10f;
        float quartersTotal = quarters * 0.25f;
         */
        float total = (pennies * 0.01f) + (nickels * 0.05f) + (dimes * 0.10f) + (quarters * 0.25f);


        if (total == 1) {
            System.out.printf("You win with the total of %.2f", total);
        } else if (total > 1) {
            System.out.printf("You were short! by %.2f", (1 - total));
        } else if (total < 1) {
            System.out.printf("You were over! by %.2f", (total - 1));
        }
    }
}
