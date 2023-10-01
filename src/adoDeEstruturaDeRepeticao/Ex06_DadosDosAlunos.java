package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex06_DadosDosAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maiorIdade = 0;
        String maiorNome = "Abc";
        String maiorSexo = "Abc";
        int contador = 0;

        do {
            System.out.println("Digite o seu nome");
            String nome = input.next();

            System.out.println("Digite o seu sexo");
            String sexo = input.next();

            System.out.println("Digite a sua idade");
            int idade = input.nextInt();

            if(idade > maiorIdade) {
                maiorIdade = idade;
                maiorNome = nome;
                maiorSexo = sexo;
            }

            contador++;

        } while (contador < 5);

        System.out.println("O aluno mais velho é " + maiorNome + " com anos " + maiorIdade + " do sexo " + maiorSexo);
    }
}
