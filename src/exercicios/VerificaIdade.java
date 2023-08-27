package exercicios;

import java.util.Scanner;

public class VerificaIdade {
    public static void main (String [] args) {
        //1. Recebe idade do usuário
        int idade = 0;
        int maiorIdade = 18;
        System.out.println("Quantos anos você tem?");

        Scanner scanner = new Scanner(System.in);
        idade = scanner.nextInt();

        scanner.close();

        //2. Verifica se o usuário tem mais de 18 anos
        if( idade >= maiorIdade){
            System.out.println("Você é maior de Idade");
        }
        else {
            System.out.println("Você é menor de idade");
        }
    }
}
