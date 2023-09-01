package ap_condicionais_exercicios;

import java.util.Scanner;

/*
    Dado um número, verifica se ele é maior que 100.
    Se for, o algoritmo deve somar 150 a esse npumero.
    No final, imprimir o resultado da soma.
 */
public class ex01_VerificaNumeroMaior {
    public static void main(String[] args) {
        //1. Recebe um número
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número");
        numero = input.nextInt();

        input.close();

        //2. Verifica se ele é maior que 100 e imprime o resultado
        int adicao = 150;
        if (numero > 100) {
            System.out.printf("O seu número teve adição de 150, o resultado é: %d", (numero + adicao));
        }
        else {
            System.out.println("Seu número não teve alteração e continua sendo: " + numero);
        }
    }
}
