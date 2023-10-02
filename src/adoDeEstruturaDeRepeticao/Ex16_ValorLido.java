package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex16_ValorLido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de números a serem lidos");
        int valoresLidos = input.nextInt();

        do {
            System.out.println("Digite o número");
            int valor = input.nextInt();
            if (valor > 0 && valor % 2 == 0) {
                System.out.println("Número par e positivo");
            } else if (valor < 0 && valor %2 == 0) {
                System.out.println("Número par e negativo");
            } else if (valor > 0 && valor %2 == 1) {
                System.out.println("Número impar e positivo");
            } else if (valor < 0 && valor %2 == -1) {
                System.out.println("Número impar e negativo");
            } else {
                System.out.println("Nulo");
            }
            valoresLidos--;
        } while (valoresLidos > 0);
    }
}
