package listaDeExercicios02;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // receber numeros
        System.out.println("Digite o primeiro número");
        int num01 = input.nextInt();

        // verfica se é par ou impar
        double resto = num01 % 2;

        if (resto == 0) {
            System.out.printf("%d é par", num01);
        } else {
            System.out.printf("%d é impar", num01);
        }
    }
}
