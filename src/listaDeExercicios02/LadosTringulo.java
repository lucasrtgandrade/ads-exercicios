package listaDeExercicios02;

import java.util.Scanner;

public class LadosTringulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado do triângulo");
        float ladoA = input.nextFloat();
        System.out.println("Digite o comprimento do segundo lado do triângulo");
        float ladoB = input.nextFloat();
        System.out.println("Digite o comprimento do terceiro lado do triângulo");
        float ladoC = input.nextFloat();

        float trianguloEquilatero = (ladoA + ladoB + ladoC) / 3;
        double perimetroEquilatero = Math.pow(ladoA, trianguloEquilatero);

        float trianguloIsoscelesA = (ladoA + ladoB) / 2;
        float trianguloIsoscelesA2 = (ladoA + ladoC) / 2;
        float trianguloIsoscelesB = (ladoB + ladoC) / 2;


        if (ladoA == trianguloEquilatero) {
            System.out.println("É um triângulo equilátero");
        } else if (trianguloIsoscelesA == ladoA) {
            System.out.println("É um triângulo isósceles");
        } else if (trianguloIsoscelesA2 == ladoA) {
            System.out.println("É um triângulo isósceles");
        } else if (trianguloIsoscelesB == ladoB) {
            System.out.println("É um triângulo isósceles");
        } else {
            System.out.println("É um triângulo escaleno");
        }
    }
}
