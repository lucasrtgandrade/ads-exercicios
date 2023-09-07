package listaDeExercicios03;

import java.util.Scanner;

public class MathPackage {
    public static void main(String[] args) {

        // variaveis
        int quadrado = 2;
        int cubo = 3;

        Scanner input = new Scanner(System.in);
        // Receber número positivo maior que zero
        System.out.println("Digite um número positivo maior que zero");
        int numero = input.nextInt();


        // Ao quadrado
        System.out.printf("O número %d ao quadrado é: %.2f\n", numero, Math.pow(numero, quadrado));
        // Ao cubo
        System.out.printf("O número %d ao cubo é: %.2f\n", numero, Math.pow(numero, cubo));
        // Raiz quadrada
        System.out.printf("A raiz quadrada do número %d é: %.2f\n", numero, Math.sqrt(numero));
        // Raiz cubica
        System.out.printf("A raiz cúbica do número %d é: %.2f\n", numero, Math.cbrt(numero));
    }

}
