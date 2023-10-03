package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex21_SomaDosDivisores {
    public static void main(String[] args) {
        int divisor = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = input.nextInt();
        int soma = 0;

        while(divisor < numero) {
            if(numero % divisor == 0) {
                System.out.println(divisor);
                soma = soma + divisor;
            }
            divisor++;
        }
        if (soma == numero) {
            System.out.printf("%d é perfeito", numero);
        } else if (soma != numero) {
            System.out.printf("%d não é perfeito", numero);
        }
    }
}
