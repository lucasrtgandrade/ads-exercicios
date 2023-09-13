package switchStatement;

import java.util.Scanner;

public class Ex04_Cardápio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o código do produto que você deseja comprar");
		int produto = input.nextInt();
	
		if (produto >= 100 && produto <=105) {
			
			System.out.println("Digite a quantidade do produto que você deseja comprar");
			float quantidade = input.nextFloat();
			
			switch (produto) {
			case 100:
				System.out.printf("Valor total do lanche é %.2f", (quantidade * 1.70));
				break;
			case 101:
				System.out.printf("Valor total do lanche é %.2f", (quantidade * 2.30));
				break;
			case 102:
				System.out.printf("Valor total do lanche é %.2f", (quantidade * 2.60));
				break;
			case 103:
				System.out.printf("Valor total do lanche é %.2f", (quantidade * 2.40));
				break;
			case 104:
				System.out.printf("Valor total do lanche é %.2f", (quantidade * 2.50));
				break;
			case 105:
				System.out.printf("Valor total do lanche é %.2f", (quantidade * 1.00));
				break;
			default: System.out.print("Valor inválido");
			}
		} else {
			System.out.print("Valor Inválido");
		}
	}

}
