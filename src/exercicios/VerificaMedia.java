package exercicios;

import java.util.Scanner;

public class VerificaMedia {
    public static void main (String[] args) {
        //1. Recebe notas
        double nota01 = 0;
        double nota02 = 0;
        double aprovado = 7;

        System.out.println("Digite as duas notas que você recebeu");
        Scanner scanner = new Scanner(System.in);

        nota01 = scanner.nextDouble();
        nota02 = scanner.nextDouble();

        scanner.close();

        //2. Calcula as notas
        double media = (nota01 + nota02) / 2;

        //3. Verifica aprovação >=7
        if ( media >= aprovado) {
            System.out.println("Sua média é: " + media + " Você foi aprovado, boas férias!!!");
        }
        else {
            System.out.println("Sua média é: " + media + " Você foi reprovado!");
        }
    }
}
