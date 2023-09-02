package javaessentials.repetitionstructure;

import java.util.Scanner;

/*
    Find the average test score for each student in the class. There are 24 students and four tests.
 */
public class NestedLoops {
    public static void main(String[] args) {

        //Initialize know variables
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner input = new Scanner(System.in);

        double total =0;

        //Process all students
        for(int i = 0; i < numberOfStudents; i++) {

            //Process a student's test scores
            for (int j=0; j<numberOfTests; j++) {
                System.out.println("Enter the score for test #" + (j+1));
                double score = input.nextDouble();
                total = total + score;
            }

            double average = total / numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }

    }
}
