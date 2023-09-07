package listaDeExercicios03;

import java.util.Scanner;

public class CalculaAnos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Recebe ano de nascimento
        System.out.println("Digite o ano em que você nasceu");
        int nascimento = input.nextInt();

        // know variables
        int anoAtual = 2023 - nascimento;
        int anoFuturo = 2050 - nascimento;

        // Imprime
        System.out.printf("Você tem %d anos\nEm 2050 você terá %d anos ", anoAtual, anoFuturo);
    }
}
