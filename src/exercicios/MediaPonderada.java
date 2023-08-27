package exercicios;

import java.util.Scanner;

public class MediaPonderada {
    public static void main (String[] args) {
    //1. Recebe a primeira nota
    double nota01 = 0;
    System.out.println("Digite a primeira nota");

    Scanner scanner = new Scanner(System.in);
    nota01 = scanner.nextDouble();

    //2. Recebe o peso da primeira nota
    double peso01 = 0;
    System.out.println("Digite o peso da primeira nota");
    peso01 = scanner.nextDouble();

    //3. Recebe a segunda nota
    double nota02 = 0;
    System.out.println("Digite a segunda nota");
    nota02 = scanner.nextDouble();

    //4. Recebe o peso da segunda nota
    double peso02 = 0;
    System.out.println("Digite o peso da segunda nota");
    peso02 = scanner.nextDouble();

    //5. Recebe a nota da ADO
    double notaAdo = 0;
    System.out.println("Digite a nota da ADO");
    notaAdo = scanner.nextDouble();

    //6. Recebe o peso da ADO
    double pesoAdo = 0;
    System.out.println("Digite o peso da ADO");
    pesoAdo = scanner.nextDouble();

    scanner.close();

    //7. Calcula a soma das notas dos pesos e a média ponderada
    double mp = (nota01*peso01 + nota02*peso02 + notaAdo*pesoAdo) / (peso01 + peso02 + pesoAdo);

    //8. Mostra a média ponderada
    System.out.println("Sua média ponderada é: " + mp);

    }
}
