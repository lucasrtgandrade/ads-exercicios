package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex02_Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int numeroMax = input.nextInt();
        int soma = 1;
        int contador = 1;
        int proxNum = 2;

        while (contador < numeroMax) {
            soma = soma + proxNum;
            proxNum++;
            contador = contador + 1;
        }
        System.out.println("A soma total é: " + soma);
    }
}
