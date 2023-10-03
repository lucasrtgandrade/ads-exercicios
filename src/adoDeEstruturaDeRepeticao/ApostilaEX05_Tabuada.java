package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class ApostilaEX05_Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número >= a 2 ou <=1000");
        int numero = input.nextInt();
        int tabuada = 1;
        int resultado;

        do {
        resultado = tabuada * numero;
        System.out.printf("%d x %d = %d\n", tabuada, numero, resultado);
        tabuada++;
        } while (tabuada <= 10);
    }
}
