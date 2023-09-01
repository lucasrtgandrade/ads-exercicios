package ap_condicionais_exercicios;

import java.util.Scanner;

/*
 Receba dois números, verificar se a divisão do primeiro pelo segundo é exata.
 Se for, o algoritmo deve imprimir a mensagem "A divisão de (número 1) por
 (número 2) é exata.
 */
public class ex02_RestoZero {
    public static void main(String[] args) {
        //1. Recebe dois número
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dividendo");
        int dividendo;
        dividendo = input.nextInt();

        System.out.println("Digite o divisor");
        int divisor;
        divisor = input.nextInt();

        input.close();

        //2. Verifica se o resto é zero e imprime mensagem
        int resultado;
        resultado = dividendo % divisor;
        if (resultado == 0) {
            System.out.printf("A divisão de %d por %d é exata.", dividendo, divisor);
        }
        else {
            System.out.printf("A divisão teve resto %d", resultado);
        }
    }
}
