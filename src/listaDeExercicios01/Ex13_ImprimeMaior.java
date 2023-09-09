package listaDeExercicios01;

import java.util.Scanner;

public class Ex13_ImprimeMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int a = input.nextInt();
        System.out.println("Digite o segundo número");
        int b = input.nextInt();
        System.out.println("Digite o terceiro número");
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.print(a);
        } else if (b > a && b > c) {
            System.out.print(b);
        } else if (c > a && c > b) {
            System.out.print(c);
        } else {
            System.out.print("Digite números diferentes");
        }

    }
}
