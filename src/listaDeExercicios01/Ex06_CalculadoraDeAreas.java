package listaDeExercicios01;

import java.util.Scanner;

public class Ex06_CalculadoraDeAreas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double a = input.nextDouble();
        System.out.println("Digite o segundo número");
        double b = input.nextDouble();
        System.out.println("Digite o terceiro número");
        double c = input.nextDouble();

        int potencia = 2;

        double areaTrianguloRetangulo = (a * c) / 2;
        System.out.printf("A área do triângulo retângulo é: %.2f\n", areaTrianguloRetangulo);

        double areaCirculo = Math.PI * (Math.pow(c, potencia));
        System.out.printf("A área do círculo de raio %.2f é: %.2f\n", c, areaCirculo);

        double areaTrapezio = ((a + b) * c) / 2;
        System.out.printf("A área do trapézio é %.2f\n", areaTrapezio);

        double areaQuadrado = Math.pow(b, potencia);
        System.out.printf("A área do quadrado é %.2f\n", areaQuadrado);

        double areaRetangulo = a * b;
        System.out.printf("A área do retângulo é %.2f\n", areaRetangulo);

        double perimetroRetangulo = 2 * (a + b);
        System.out.printf("A perímetro do retângulo é %.2f\n", perimetroRetangulo);

    }
}
