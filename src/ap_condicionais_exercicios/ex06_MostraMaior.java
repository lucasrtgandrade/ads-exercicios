package ap_condicionais_exercicios;

import java.util.Scanner;

/*
    Receba dois números e mostre o maior
 */
public class ex06_MostraMaior {
    public static void main(String[] args) {

        //1. Receber os valores
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero01 = input.nextInt();

        System.out.println("Digite o segundo númeor: ");
        int numero02 = input.nextInt();

        //2. Verificar o maior

        if (numero01 > numero02) {
            System.out.printf("O maior número é: %d", numero01);
        } else if (numero01 < numero02) {
            System.out.printf("O maior número é: %d", numero02);
        } else {
            System.out.printf("Números iguais, %d e %d", numero01 , numero02);
        }
    }
}
