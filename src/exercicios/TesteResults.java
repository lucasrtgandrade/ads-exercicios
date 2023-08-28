package exercicios;

import java.util.Scanner;

/*
Describe the exercice
 */
public class TesteResults {
    public static void main(String[] args) {
        //1. Get the test score
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //2. Determine the letter grade
        char grade;
        if(score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        //3. Output
        System.out.println("Your grade is: " + grade);
    }

}
