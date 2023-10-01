package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex09_MediaDosAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos alunos tem na sala?");
        int alunos = input.nextInt();

        while (alunos > 0) {
            System.out.println("Digite o seu nome");
            String nome = input.next();
            System.out.println("Digite a nota 01");
            float nota01 = input.nextFloat();
            System.out.println("Digite a nota 02");
            float nota02 = input.nextFloat();
            System.out.println("Digite a ADO");
            float ado = input.nextFloat();

            System.out.printf("A média aritmética do(a) Aluno(a): %s é %.2f\n", nome, ((nota01 + nota02+ ado)/3));
            alunos--;
        }
    }
}
