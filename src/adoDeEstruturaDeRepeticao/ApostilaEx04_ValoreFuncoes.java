package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class ApostilaEx04_ValoreFuncoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        float somaPositivos = 0;
        int totalPositivos = 0;
        float media = 0;

        while(i <= 5) {
            System.out.println("Digite um numero");
            int numero = input.nextInt();
            if(numero > 0) {
                somaPositivos = somaPositivos + numero;
                totalPositivos++;
                media = somaPositivos / 6;
            }
            i++;
        }
        System.out.printf("Soma dos números digitados é: %.2f\n", somaPositivos);
        System.out.printf("Foram digitados %d números positivos\n", totalPositivos);
        System.out.printf("A média dos números digitados é: %.2f", media);
    }
}
