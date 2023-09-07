package listaDeExercicios03;

import java.util.Scanner;

/*
    Calcule e mostre a área de um circulo
    A = pi * R²
*/
public class CalculaAreaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio do círculo");
        float raio = input.nextFloat();
        int potencia = 2;

        //Calcula o raio
        double area = Math.PI * Math.pow(raio, potencia);

        // Imprime
        System.out.printf("A área do círculo de %f é: %2f", raio, area);
    }
}
