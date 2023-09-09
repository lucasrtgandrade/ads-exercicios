package listaDeExercicios01;

import java.util.Scanner;

public class Ex16_HoraDoJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a hora inicial do jogo");
        int horaInicial = input.nextInt();
        System.out.println("Digite a hora final do jogo");
        int horaFinal = input.nextInt();

        if ( horaInicial >= horaFinal) {
            System.out.printf("O jogo durou %d horas", (24 - horaInicial + horaFinal));
        } else if ( horaInicial < horaFinal) {
            System.out.printf("O jogo durou %d horas", ((24 - horaInicial) - (24 - horaFinal)));
        } else {
            System.out.print("O jogo deve ter duração mínima de 1 hora");
        }
    }
}
