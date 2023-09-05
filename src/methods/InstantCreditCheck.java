package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    public static void main(String[] args) {
        //Get Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter your credit score: ");
        int creditScore = input.nextInt();


        //Check if user is qualified
        isUserQualified(creditScore, salary); {
        }

    }

    public static void isUserQualified(int creditScore, double salary) {
        double requiredSalary = 2500;
        int requiredCreditScore = 700;
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            System.out.println("Congrats! You've been approved");
        }
        else {
            System.out.println("Sorry, you've been declined");
        }
    }

}
