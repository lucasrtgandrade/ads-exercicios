package adoDeEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex20_OperacoesBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float saldo = 0;
        int opcao;

        do {
            System.out.printf("\nO seu saldo é %.2f\nEscolha uma opção:\n1 - Depósito\n2 - Saque\n3 - Sair\n", saldo);
            opcao = input.nextInt();
            switch (opcao) {
                case 1 :
                    System.out.println("Qual valor deseja depositar?");
                    float deposito = input.nextFloat();
                    System.out.printf("Depósito de %.2f concluído", deposito);
                    saldo = saldo + deposito;
                    break;
                case 2 :
                    System.out.println("Qual valor deseja sacar?");
                    float saque = input.nextFloat();
                    System.out.printf("Saque de %.2f concluído", saque);
                    saldo = saldo - saque;
                    break;
            }
        } while (opcao != 3);
        if(saldo == 0) {
            System.out.println("Conta zerada");
        } else if (saldo < 0) {
            System.out.println("Conta estourada!");
        } else if (saldo > 0) {
            System.out.println("Conta preferencial");
        }
    }
}
