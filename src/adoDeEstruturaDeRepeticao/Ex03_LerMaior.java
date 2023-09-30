package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex03_LerMaior {
    public static void main(String[] args) {

        int maior = 0;
        int numero = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um número");
            Scanner input = new Scanner(System.in);
            numero = input.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número é " + maior);
    }
}
