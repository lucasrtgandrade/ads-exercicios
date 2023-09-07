package listaDeExercicios02;

import java.util.Scanner;

public class TresNumerosOrdemCrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // receber numeros
        System.out.println("Digite o primeiro número");
        int num01 = input.nextInt();
        System.out.println("Digite o segundo número");
        int num02 = input.nextInt();
        System.out.println("Digite o terceiro número");
        int num03 = input.nextInt();

        // Organizar ordem
        if (num01 > num02 && num01 > num03 && num02 > num03) {
            System.out.printf("Os números que você digitou na ordem crescente %d, %d, %d", num03, num02, num01);
        } else if (num01 > num02 && num01 > num03 && num03 > num02) {
            System.out.printf("Os números que você digitou na ordem crescente %d, %d, %d", num02, num03, num01);
        } else if (num02 > num01 && num02 > num03 && num01 > num03) {
            System.out.printf("Os números que você digitou na ordem crescente %d, %d, %d", num03, num01, num02);
        } else if (num03 > num01 && num03 > num02 && num01 > num02) {
            System.out.printf("Os números que você digitou na ordem crescente %d, %d, %d", num02, num01, num03);
        } else if (num03 > num01 && num03 > num02 && num02 > num01) {
            System.out.printf("Os números que você digitou na ordem crescente %d, %d, %d", num01, num02, num03);
        } else {
            System.out.printf("Os números que você digitou na ordem crescente %d, %d, %d", num01, num03, num02);
        }
    }
}
