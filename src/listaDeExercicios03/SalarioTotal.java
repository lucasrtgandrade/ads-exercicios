package listaDeExercicios03;

import java.util.Scanner;

public class SalarioTotal {
    public static void main(String[] args) {
        //Receber valores
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas horas você trabalhou nesse mês?");
        float horasTrabalhadas = input.nextFloat();

        System.out.println("Qual o valor do salário mínimo?");
        float salarioMinimo = input.nextFloat();

        // Calculos
        float valorHorasTrabalhadas = salarioMinimo / 2;
        float salarioBruto = horasTrabalhadas * valorHorasTrabalhadas;
        float imposto = salarioBruto * 0.03f;
        float salarioReceber = salarioBruto - imposto;

        // Imprime
        System.out.printf("Você pagou %.2f em impostos\nE seu salário bruto é %.2f", imposto, salarioReceber);
    }
}
