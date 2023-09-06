package listaDeExercicios01;
/*
    Fazer um algoritmo que leia dois números e imprima na tela
    o produto (multiplicação) dos dois números
 */


import java.util.Scanner;

public class Ex01_Multiplicacao {
    public static void main(String[] args) {
        // Recebe números
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num01 = input.nextInt();
        System.out.println("Digite o segundo número");
        int num02 = input.nextInt();

        // Multiplicação
        int resultado = num01 * num02;

        System.out.printf("O resultado do %d * %d é: %d", num01, num02, resultado);
    }
}
