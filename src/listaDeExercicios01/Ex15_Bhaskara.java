package listaDeExercicios01;

import java.util.Scanner;

public class Ex15_Bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        double a = input.nextDouble();
        System.out.println("Digite o valor de B");
        double b = input.nextDouble();
        System.out.println("Digite o valor de C");
        double c = input.nextDouble();

        double potencia = 2;

        double delta = Math.pow (b,potencia) - (4 * a * c);
        double x1 = (-b + Math.sqrt(delta)) / 2;
        double x2 = (-b - Math.sqrt(delta)) / 2;

        System.out.print(delta);
        System.out.printf("\nAs raízes da equação %.2f² + %.2f - %.2f = x são %.2f e %.2f.", a, b, c, x1, x2);

    }
}
