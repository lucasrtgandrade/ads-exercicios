package listaDeExercicios02;

import java.util.Scanner;

public class MediaAprovacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Recebe três notas
        System.out.println("Digite a primeira nota");
        float nota01 = input.nextFloat();
        System.out.println("Digite a segunda nota");
        float nota02 = input.nextFloat();
        System.out.println("Digite a terceira nota");
        float nota03 = input.nextFloat();

        // Calcuar Media Aritmética
        float media = (nota01 + nota02 + nota03) / 3;

        // Verifica Aprovação
        float exame = 6;
        if (media >= 6) {
            System.out.printf("Você foi aprovado com média %.2f", media);
        }
        else if (media >= 3) {
            System.out.printf("Você está de exame com média %.2f\ne precisa de %.2f pontos para passar de ano", media, (exame - media));
        }
        else {
            System.out.printf("Você foi reprovado");
        }
    }
}
