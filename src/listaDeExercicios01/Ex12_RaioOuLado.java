package listaDeExercicios01;

import java.util.Scanner;

public class Ex12_RaioOuLado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de L");
        double l = input.nextDouble();
        System.out.println("Digite o valor de R");
        double r = input.nextDouble();

        double potencia = 2;

        double areaQuadrado = Math.pow(l, potencia);
        double raioCirculo = Math.PI * (Math.pow(r, potencia));

        if (areaQuadrado > raioCirculo) {
            System.out.printf("O quadrado tem área maior de %.2f", areaQuadrado);
        } else if (raioCirculo > areaQuadrado) {
            System.out.printf("O círculo tem raio maior de %.2f", raioCirculo);
        }

    }
}
