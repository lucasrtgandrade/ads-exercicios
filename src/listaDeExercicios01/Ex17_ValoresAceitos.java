package listaDeExercicios01;

import java.util.Scanner;

public class Ex17_ValoresAceitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Receber valores
        System.out.println("Digite o primeiro número");
        int a = input.nextInt();
        System.out.println("Digite o segundo número");
        int b = input.nextInt();
        System.out.println("Digite o terceiro número");
        int c = input.nextInt();
        System.out.println("Digite o quarto número");
        int d = input.nextInt();

        double resto = a % 2;


        // Verificar valores aceitos
        if ( (b > c) && (d > a) && (c + d > a + b) && (c > 0 && d > 0) && (resto == 0) ) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }
    }
}
