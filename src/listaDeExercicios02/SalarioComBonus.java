package listaDeExercicios02;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        // Receber salario
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o seu salário");
        double salario = input.nextDouble();

        // Verificar salário

        if (salario <= 500) {
            double bonificacao01 = salario * 0.05f;
            double auxilio01 = 150;
            System.out.printf("Seu salário é, %.2f\nSua bonificação é de %.2f\nSeu auxílio escola é de %.2f\nSeu salário total é %.2f", salario, bonificacao01, auxilio01, (salario + bonificacao01 + auxilio01));
        } else if (salario > 500 && salario <= 600) {
            double bonificacao02 = salario * 0.12f;
            double auxilio02 = 150;
            System.out.printf("Seu salário é, %.2f\nSua bonificação é de %.2f\nSeu auxílio escola é de %.2f\nSeu salário total é %.2f", salario, bonificacao02, auxilio02, (salario + bonificacao02 + auxilio02));
        } else if (salario > 600 && salario <=1200) {
            double bonificacao02 = salario * 0.12f;
            double auxilio02 = 100;
            System.out.printf("Seu salário é, %.2f\nSua bonificação é de %.2f\nSeu auxílio escola é de %.2f\nSeu salário total é %.2f", salario, bonificacao02, auxilio02, (salario + bonificacao02 + auxilio02));
        } else {
            double auxilio02 = 100;
            System.out.printf("Seu salário é, %.2f\nVocê não tem direito a bonificação\nSeu auxílio escola é de %.2f\nSeu salário total é %.2f", salario, auxilio02, (salario + auxilio02));
        }
    }
}
