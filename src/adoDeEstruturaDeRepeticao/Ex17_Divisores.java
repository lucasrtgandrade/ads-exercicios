package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex17_Divisores {
    public static void main(String[] args) {
        int divisor = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = input.nextInt();

        while(divisor <= numero) {
            if(numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
    }
}
