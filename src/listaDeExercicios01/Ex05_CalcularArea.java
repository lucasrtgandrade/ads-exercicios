package listaDeExercicios01;

import java.util.Scanner;

public class Ex05_CalcularArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado");
        int l = input.nextInt();
        int potencia = 2;

        double area = Math.pow(l, potencia);
        System.out.printf("A área de lado %d é %.2f", l, area);

    }
}
