package switchStatement;

import java.util.Scanner;

public class Ex01_LeitorDeProdutos {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número do Produto");
		int numeroProduto = input.nextInt();
		
		switch (numeroProduto) {
		case 1: 
			System.out.println("Alimento não perecível");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("Alimento perecível");
			break;
		case 5:
		case 6:
			System.out.println("Vestuário");
			break;
		case 7:
			System.out.println("Higiene Pessoal");
			break;
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		default: 
			System.out.println("Código Inválido");
		}
		
	}
}
