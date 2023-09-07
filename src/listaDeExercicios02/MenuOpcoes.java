package listaDeExercicios02;

import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O que você deseja fazer?\n1. Para somar dois números\n2. Para tirar a raiz quadrada de um número");
        System.out.println("Digite a opção que deseja:");
        int opcao = input.nextInt();

        // Opcao 01
        if (opcao == 1) {
            // Receber numeros para soma
            System.out.println("Digite o primeiro número");
            int numSoma01 = input.nextInt();
            System.out.println("Digite o segundo número");
            int numSoma02 = input.nextInt();
            // Calcular e imprimir resultado
            int resultadoSoma = numSoma01 + numSoma02;
            System.out.printf("A soma entre %d e %d é: %d", numSoma01, numSoma02, resultadoSoma);
        } else if (opcao == 2) {
            // Receber número
            System.out.println("Digite um número para descobrir a raiz quadrada");
            double numRaiz = input.nextDouble();
            double resultadoSqrt = Math.sqrt(numRaiz);
            System.out.printf("A raiz quadrada de %.2f é: %.2f", numRaiz, resultadoSqrt);
        } else {
            System.out.print("Digite um número válido entre as opções");
        }

    }
}
