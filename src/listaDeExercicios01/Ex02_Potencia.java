package listaDeExercicios01;
/*
    Fazer um algoritmo que lê dois números,
    a base e o expoente, e imprime a potência
 */
import java.util.Scanner;

public class Ex02_Potencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Recebe dois números
        System.out.println("Digite o primeiro número");
        int numero01 = input.nextInt();

        System.out.println("Digite o segundo número");
        int numero02 = input.nextInt();

        // Cálcula a potência
        System.out.print("A base: " + numero01 + " e o expoente: " + numero02 + " tem potência de: " + (Math.pow(numero01, numero02)));

    }
}
