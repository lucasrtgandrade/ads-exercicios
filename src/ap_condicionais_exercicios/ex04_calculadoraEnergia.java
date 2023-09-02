package ap_condicionais_exercicios;

import java.util.Scanner;

/*
    Calcular a conta de consumo de energia elétrica de um consumidor, dado o kWh consumido:
    <150kWh = R$0,20;
    >=150kWh e <500 = R$0,25;
    >=500 = R$0,30;
    Valor mínimo da conta R$11,90
 */
public class ex04_calculadoraEnergia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Recebe dados kWh consumidos
        int consumo;
        System.out.println("Digite quantos kWh você consumiu no mês: ");
        consumo = input.nextInt();

        input.close();

        //2. Cálcuo do valor de acordo com o gasto
        double total;
        double minimo = 11.90;

        double k1 = 0.20;
        double k2 = 0.25;
        double k3 = 0.30;


        if (consumo < 150) {
            total = consumo*k1;
        } 
        else if ((consumo >= 150) && (consumo <500)) {
            total = consumo*k2;
        }
        else {
            total = consumo*k3;
        }

        //3. Verifica se a conta teve um valor menor que R$ 11.90

        if (total < 11.90) {
            System.out.println("Você teve consumo mínimo sua conta é: R$" +minimo);
        }
        else {
            System.out.println("Sua conta total é: R$" +total);
        }
    }
}
