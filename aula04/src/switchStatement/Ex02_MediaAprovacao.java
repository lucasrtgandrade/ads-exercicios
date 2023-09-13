package switchStatement;

import java.util.Scanner;

public class Ex02_MediaAprovacao {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota01 = input.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota02 = input.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		
		char aprovacao = '0';
		
		if (media >=7.1 && media <=10) {
			aprovacao = 'A';
		} else if (media >= 4.1 && media <= 7) {
			aprovacao = 'B';
		} else if (media <=4) {
			aprovacao = 'C';
		}
		
		switch (aprovacao) {
		case 'A':
			System.out.printf("Aprovado e sua média é: %.2f", media);
			break;
		case 'B':
			System.out.printf("Você está de exame e sua média é: %.2f", media);
			break;
		case 'C':
			System.out.printf("Você foi reprovado e sua média é: %.2f", media);
			break;
		default: 
			System.out.print("Valor inválido");
		}
		
	}

}
