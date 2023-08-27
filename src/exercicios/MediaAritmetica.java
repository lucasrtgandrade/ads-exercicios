package exercicios;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main (String[] args) {
        //1. Digite a primeira nota
        double nota01 = 0;
        System.out.println("Digite a primeira nota");

        Scanner scanner = new Scanner(System.in);
        nota01 = scanner.nextDouble();

        //2. Digite a segunda nota
        double nota02 = 0;
        System.out.println("Digite a segunda nota");
        nota02 = scanner.nextDouble();

        //3. Digite a terceira nota
        double nota03 = 0;
        System.out.println("Digite a terceira nota");
        nota03 = scanner.nextDouble();

        scanner.close();

        //4. Calcula as três notas
        double ma = (nota01 + nota02 + nota03)/3;

        //5. Mostra a média aritmética
        System.out.println("Suma média é: " + ma);
    }
}
