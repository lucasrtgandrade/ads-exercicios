package listaDeExercicios01;

import java.util.Scanner;

public class Ex11_VerificaNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        int num01 = input.nextInt();

        if (num01 < 0) {
            System.out.print("Número negativo");
        } else {
            System.out.println(num01 + " é positivo");
        }
    }
}
