package listaDeExercicios01;

import java.util.Scanner;

public class Ex14_DivisaoMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int a = input.nextInt();
        System.out.println("Digite o segundo número");
        int b = input.nextInt();

        if ( (a > b) && (a > 0) && (b > 0) ) {
            System.out.printf("A divisão de %d por %d é %d", a, b, (a/b));
        } else if ( b > a && a > 0) {
            System.out.printf("A divisão de %d por %d é %d", b, a, (b/a));
        } else if ( (a == 0) || (b == 0) ) {
            System.out.print("Impossível dividir por zero");
        }
    }
}
