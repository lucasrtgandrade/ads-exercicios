package listaDeExercicios03;

import java.util.Scanner;

public class OperacaoBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Know variables
        System.out.println("Quanto você quer depositar?");
        float saldoInicial = input.nextFloat();
        float CPMF = 0.0038f;

        // Primeiro saque
        System.out.println("Quanto você quer sacar?");
        float saque = input.nextFloat();
        float imposto01 = (saldoInicial * CPMF);
        float cheque1 =  saque + imposto01 ;
        System.out.printf("%.2f\n", cheque1);

        // Saldo Atualizado
        float saldoAtual = saldoInicial - cheque1;
        System.out.printf("Você sacou %.2f e pagou %.2f de imposto\nSeu saldo atual é %.2f\n", saque, imposto01, saldoAtual);

        // Segundo saque
        System.out.println("Quanto você quer sacar?");
        float saque2 = input.nextFloat();
        float imposto02 = (saldoAtual * CPMF);
        float cheque2 = saque2 + imposto02;
        float saldoFinal = saldoAtual - cheque2;
        System.out.printf("Você sacou %.2f e pagou %.2f de imposto\nSeu saldo atual é %.2f\n", saque2, imposto02, saldoFinal);

    }
}
