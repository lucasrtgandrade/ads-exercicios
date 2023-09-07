package listaDeExercicios03;

import java.util.Scanner;

public class NumerosElevados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número positivo maior que zero");
        int num01 = input.nextInt();
        System.out.println("Digite o segundo número positivo maior que zero");
        int num02 = input.nextInt();

        // calcular
        System.out.printf("O número %d elevado ao %d é: %.2f", num01, num02, Math.pow(num01, num02));
    }
}
