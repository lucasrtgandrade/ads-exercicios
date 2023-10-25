package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex18_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro menor que 46");
        int numero = input.nextInt();

        int primeiroNum = 0;
        int segundoNum = 1;
        int soma = 0;

        while (soma <= numero) {
            soma = primeiroNum + segundoNum;
            System.out.printf("%d, ", primeiroNum);
            primeiroNum = segundoNum;
            segundoNum = soma;
        }
    }
}
