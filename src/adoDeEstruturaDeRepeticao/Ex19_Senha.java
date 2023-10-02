package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex19_Senha {
    public static void main(String[] args) {
        int senha = 2002;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha");
        int userSenha = input.nextInt();

        while (senha != userSenha) {
            System.out.println("Senha Inválida. Digite novamente");
            System.out.println("Digite a senha");
            userSenha = input.nextInt();
        }

        System.out.println("Acesso permitido");
    }
}
