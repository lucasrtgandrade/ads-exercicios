package listaDeExercicios01;

import java.util.Scanner;

public class Ex07_Hipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado A");
        double ladoA = input.nextDouble();
        System.out.println("Digite o tamanho do lado B");
        double ladoB = input.nextDouble();

        double potencia = 2;

        double preHipotenusa = Math.pow(ladoA, potencia) + Math.pow(ladoB, potencia);
        double hipotenusa = Math.sqrt(preHipotenusa);

        System.out.printf("A hipotenusa de %.2f e %.2f é %.2fcm", ladoA, ladoB, hipotenusa);
    }
}
