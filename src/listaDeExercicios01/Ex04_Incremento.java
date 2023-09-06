package listaDeExercicios01;

import java.util.Scanner;

public class Ex04_Incremento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Recebe dois números
        System.out.println("Digite o primeiro número");
        int numero01 = input.nextInt();

        System.out.println("Digite o segundo número");
        int numero02 = input.nextInt();

        // Incrementa váriaveis
        int incremento01 = numero01++;
        int incremento02 = numero02++;

        // Imprime números incrementados
        System.out.printf("Você digitou %d e %d\nOs números consecutivos são %d e %d.", incremento01, incremento02, numero01, numero02);
    }
}
