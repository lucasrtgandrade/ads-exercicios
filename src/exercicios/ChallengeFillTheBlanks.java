package exercicios;

import java.util.Scanner;

public class ChallengeFillTheBlanks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type an adjective");
        String adjective = input.next();

        System.out.println("Type your favorite season of the year");
        String season = input.next();

        System.out.println("Type a number");
        int number;
        number = input.nextInt();

        input.close();

        System.out.println("On a " + adjective + " " + season + " day, \nI drink a minimum of " + number + " cups of coffee.");
    }
}
