package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex15_Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número maior que zero");
        int numero = input.nextInt();

        int fatorial = numero;
        int calculo = numero;

        while (calculo > 1) {
            fatorial = fatorial * (calculo-1);
            calculo--;
        }
        System.out.printf("%d! = %d", numero, fatorial);
    }
}
