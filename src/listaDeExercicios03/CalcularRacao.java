package listaDeExercicios03;

import java.util.Scanner;

public class CalcularRacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o peso da ração comprada");
        float peso = input.nextFloat();
        float pesoGramas = peso * 1000;

        System.out.println("Digite quantas gramas os gatos recebem em um dia");
        float porcao = input.nextFloat();

        // know variables
        int dias = 5;
        float consumo = (porcao * 2) * dias;
        float resto = (pesoGramas - consumo) / 1000;

        System.out.printf("Você comprou uma ração de %.2fKg\nSeus gatos receberam %.2fg de ração por dia totalizando %.2fg de consumo em 5 dias\nSobraram %.2fkg de ração dos gatos", peso, porcao, consumo, resto);


    }
}
