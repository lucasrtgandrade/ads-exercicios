package listaDeExercicios03;

import java.util.Scanner;

public class CustoAoConsumidor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Recebe valores
        System.out.println("Qual o preço de fábrica do carro?");
        float precoFabrica = input.nextFloat();
        System.out.println("Qual o percentual de lucro da distribuidora?");
        float lucro = input.nextFloat();
        System.out.println("Qual o percentual de impostos do carro?");
        float imposto = input.nextFloat();

        // Calcula
        float lucroFinal = precoFabrica * (lucro/100);
        float impostoFinal = precoFabrica * (imposto/100);
        float precoFinal = lucroFinal + impostoFinal + precoFabrica;

        // Imprime valores
        System.out.printf("O valor correspondente ao lucro do distribuidor é %.2f\n", lucroFinal);
        System.out.printf("O valor correspondente aos impostos são %.2f\n", impostoFinal);
        System.out.printf("O preço final do veículo é %.2f\n", precoFinal);
    }
}
