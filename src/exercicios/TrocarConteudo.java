package exercicios;

import java.util.Scanner;

public class TrocarConteudo {
    public static void main (String[] args ) {
        //1. Usuario digita o primeiro número
        int num01 = 0;
        System.out.println("Digite o primeiro número");

        Scanner scanner = new Scanner(System.in);
        num01 = scanner.nextInt();

        //2. Usuário digita o segundo número
        int num02 = 0;
        System.out.println("Digite o Segundo número");
        num02 = scanner.nextInt();

        scanner.close();

        //3. Trocar conteúdo dos números
        num01 = num02;

        //4. Mostrar valores invertidos
        System.out.println("Você digitou primeiro o número: " + num02 + " Depois você digitou o número: " + num01);


    }
}
