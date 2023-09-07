package listaDeExercicios03;

import java.util.Scanner;

public class Conversão {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma medida em pés");
        float ft = input.nextFloat();

        // know variables
        float polegadas = ft * 12;
        float jardas = ft / 3.000000f;
        float milhas = ft / 5280.000f;

        // Calcula e imprime
        System.out.printf("Sua media de pés %.2f em polegadas é: %.2f\n", ft, polegadas);
        System.out.printf("Sua media de pés %.2f em jardas é: %2f\n", ft, jardas);
        System.out.printf("Sua media de pés %.2f em milhas é: %f\n", ft, milhas);
    }
}
