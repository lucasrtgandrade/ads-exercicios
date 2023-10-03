package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class ApostilaEx02_Impar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = input.nextInt();

        for (int i = 0; i <= numero; i++) {
            if (i %2 != 0) {
                System.out.println(i);
                i++;
            }
        }
    }
}
