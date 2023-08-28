package exercicios;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String[] args) {
        //1. Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //2. Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //3. Quick detour for the bonus earners
        if(sales > quota) {
            salary = salary + bonus;
        }

        //4. Output
        System.out.println("The employee's pay is: " + salary);
    }
}
