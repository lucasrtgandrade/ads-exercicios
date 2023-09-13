package switchStatement;

import java.util.Scanner;

public class SwitchstatementExemplo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota01 = input.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota02 = input.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double nota03 = input.nextDouble();
		
		double media = (nota01 + nota02 + nota03) / 3;
		char grade;
		
		if (media >= 9 || media >=10) {
			grade = 'A';
		} else if (media >= 8.9 || media >= 8) {
			grade = 'B';
		} else if (media >= 7 || media >= 7.9) {
			grade = 'C';
		} else if (media >= 6 || media >= 6.9) {
			grade = 'D';
		} else {
			grade = 'E';
		}
		
		switch (grade) {
		case 'A': 
			System.out.printf("Excelente! Sua média é: %.2f e sua grade é: %c", media, grade);
			break;
		case 'B':
			System.out.printf("Bem feito! Sua média é: %.2f e sua grade é: %c", media, grade);
			break;
		case 'C':
			System.out.printf("Bem feito! Sua média é: %.2f e sua grade é: %c", media, grade);
			break;
		case 'D':
			System.out.printf("Você passou! Sua média é: %.2f e sua grade é: %c", media, grade);
			break;
		case 'E':
			System.out.printf("Melhor tentar novamente! Sua média é: %.2f e sua grade é: %c", media, grade);
			break;
		default: System.out.println("Conceito Inválido");
		}
	}

}
