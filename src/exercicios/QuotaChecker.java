package exercicios;

import java.util.Scanner;

/* If-else Statement.
All salespeople are expected to make at least
 */
public class QuotaChecker {
    public static void main (String[] args) {
        //1. Initialize know values
        int quota = 10;

        //2. Get values for the unkown
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //3. Quick detour for the bonus earners
        if(sales >= quota) {
            System.out.println("Congrats! You've met your quota");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota!. You were " + salesShort + " sales short");
        }
    }
}
