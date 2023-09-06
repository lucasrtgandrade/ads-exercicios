package listaDeExercicios01;

import java.util.Scanner;

public class Ex03_SomaDosQuadrados {
    public static void main(String [] args) {
        // Recebe números
        Scanner input = new Scanner(System.in);
        System.out.println("Inserir primeiro número:");
        float numero01 = input.nextFloat();

        System.out.println("Inserir segundo número: ");
        float numero02 = input.nextFloat();

        // Soma dos quadrados
        double resultado = (Math.sqrt(numero01) + Math.sqrt(numero02));
        System.out.printf("A soma dos quadrados dos números %.2f e %.2f é: %.2f", numero01, numero02, resultado);
    }
}
