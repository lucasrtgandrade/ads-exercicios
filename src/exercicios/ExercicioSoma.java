package exercicios;

import java.util.Scanner;

public class ExercicioSoma {

    public static void main(String[] args) {
        //1. Recebe primeiro número inteiro
        int num01 = 0;
        System.out.println("Digite o primeiro inteiro");

        Scanner scanner = new Scanner(System.in);
        num01 = scanner.nextInt();

        //2. Recebe segundo número inteiro
        int num02 = 0;
        System.out.println("Digite o segundo número inteiro");
        num02 = scanner.nextInt();

        //3. Recebe terceiro número inteiro
        int num03 = 0;
        System.out.println("Digite o terceiro número inteiro");
        num03 = scanner.nextInt();

        //4. Recebe quarto número inteiro
        int num04 = 0;
        num04 = 0;
        System.out.println("Digite o quarto e último número para a soma");
        num04 = scanner.nextInt();

        scanner.close();

        //5. Soma os quatro números digitados
        int soma = num01 + num02 + num03 + num04;

        //6. Mostra o valor da soma
        System.out.println("A soma dos quatro números é: " + soma);
    }
}
