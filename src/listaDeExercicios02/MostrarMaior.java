package listaDeExercicios02;

import java.util.Scanner;

public class MostrarMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // receber numeros
        System.out.println("Digite o primeiro número");
        int num01 = input.nextInt();
        System.out.println("Digite o segundo número");
        int num02 = input.nextInt();

        // verificar maior
        if (num01 > num02) {
            System.out.printf("O número %d é maior que o número %d", num01, num02);
        } else if (num01 == num02) {
            System.out.print("Digite números diferentes");
        }
        else {
            System.out.printf("O número %d é maior que %d", num02, num01);
        }
    }
}
