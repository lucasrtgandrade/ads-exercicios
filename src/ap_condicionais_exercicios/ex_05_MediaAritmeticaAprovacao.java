package ap_condicionais_exercicios;
/*
    Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a
    mensagem constante na tabela a seguir.
    Aos alunos que ficaram para exame, calcule e mostre a nota
    que deverão tirar para serem aprovados, considerando que a média exigida é 6,0.

    <=0 3< Reprovado
    <=3 <7 Exame
    <=7 <=10 Aprovado
 */

import java.util.Scanner;

public class ex_05_MediaAritmeticaAprovacao {
    public static void main(String[] args) {
        //1. Receber as três notas do aluno
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva sua primeira nota: ");
        double nota01;
        nota01 = input.nextDouble();
        System.out.println("Escreva sua segunda nota: ");
        double nota02;
        nota02 = input.nextDouble();
        System.out.println("Escreva a nota da ADO");
        double ado;
        ado = input.nextDouble();

        input.close();

        //2. Calcula a Média Aritmética
        double media = (nota01 + nota02 + ado) / 3;

        //3. Verifica aprovação
        if ((media >= 7) && (media <= 10)) {
            System.out.printf("Você foi aprovado! %.2f" , media);
        } else if ((media > 3 ) && (media < 7)) {
            System.out.printf("Voce está de exame, procure o coordenador. %.2f" , media);
        } else if ((media >= 0) && (media < 3)) {
            System.out.printf("Você foi reprovado. %.2f" , media);
        } else {
            System.out.println("Nota inválida " + media);
        }
    }
}
