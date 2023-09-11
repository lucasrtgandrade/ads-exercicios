package listaDeExercicios01;

import java.util.Scanner;

public class Ex09_CalculadoraDeSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Recebe o cadastro do funcionário
        System.out.println("Digite o número do seu cadastro");
        float cadastro = input.nextFloat();

        System.out.println("Digite quantas horas você trabalhou no mês");
        float horasTrabalhadas = input.nextFloat();

        System.out.println("Digite quanto você recebe por hora");
        float valorHoras = input.nextFloat();

        float salario = horasTrabalhadas * valorHoras;

        // Imprime
        System.out.printf("Olá, %.2f\nNeste mês você trabalhou durante %.2f\nSeu salário é de: R$%.2f", cadastro, horasTrabalhadas, salario);

    }
}
