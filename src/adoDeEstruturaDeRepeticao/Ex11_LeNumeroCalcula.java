package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex11_LeNumeroCalcula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        float n = input.nextFloat();

        float divisor = 1;
        float soma = 1;

        while(divisor <= n) {
            if(divisor % 2 == 0) {
                soma = soma + (1/divisor);
                divisor++;
            }
            soma = soma - (1/divisor);
            divisor++;
        }
        System.out.println(soma);
    }
}
