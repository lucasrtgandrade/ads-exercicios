package listaDeExercicios01;

import java.util.Scanner;

public class Ex10_CalculadoraDeComissao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = input.next();

        System.out.println("Qual o seu salário fixo?");
        float salarioFixo = input.nextFloat();

        System.out.println("Qual o valor em vendas você teve esse mês?");
        float vendasMes = input.nextFloat();

        float salarioTotal = (vendasMes * 0.15f) + salarioFixo;
        System.out.printf("Olá %s\nVocê vendeu %.2f neste mês.\nSeu salário + comissão é de R$%.2f", nome, vendasMes, salarioTotal);

    }
}
