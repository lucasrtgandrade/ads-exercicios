package methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greetUser();
    }

    public static void greetUser() {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hi there, " + name);
    }
}
