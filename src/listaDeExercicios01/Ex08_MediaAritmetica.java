package listaDeExercicios01;

import java.util.Scanner;

public class Ex08_MediaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double a = input.nextDouble();
        System.out.println("Digite o segundo número");
        double b = input.nextDouble();
        System.out.println("Digite o terceiro número");
        double c = input.nextDouble();
        System.out.println("Digite o quarto número");
        double d = input.nextDouble();

        double media = (a + b + c + d) / 4;

        System.out.printf("Sua média é %.2f", media);
    }
}
