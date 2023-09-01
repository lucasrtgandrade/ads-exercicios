package ap_condicionais_exercicios;

import java.util.Scanner;

/*
    Dada a ltura e o peso de uma pessoa, determinar seu grau de obesidade.
    O grau de obesidade é determinado pelo índice da massa corpórea (Massa = Peso / Altura²)
    Através da tabela abaixo:
        < 26 Normal
        >= 26 e < 30 Obeso
        >= 30 Obeso Mórbido
 */
public class ex03_CalculadoraPeso {
    public static void main(String[] args) {
        //1. Recebe a altura e o peso
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu peso:");
        double peso;
        peso = input.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura;
        altura = input.nextDouble();

        input.close();

        //2. Calcula IMC da pessoa
        double massa = peso / (altura * altura);
        if (massa < 26) {
            System.out.println("Peso normal " + massa);
        }
        else if ((massa >= 26) || (massa > 30)) {
            System.out.println("Obeso " + massa);
        }
        else {
            System.out.println("Obeso Mórbido " + massa);
        }
    }
}
