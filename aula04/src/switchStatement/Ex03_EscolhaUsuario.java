package switchStatement;

import java.util.Scanner;

public class Ex03_EscolhaUsuario {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a opção desejada\n1. Média entre os números\n2.diferença entre os números\n3. Produto entre os números\n4. Divisão do primeiro pelo segundo");
		int opcao = input.nextInt();
		
		double calculo = 0;
		char executar = '0';
		
		System.out.println("Digite o número 1");
		int num01 = input.nextInt();
		System.out.println("Digite o número 2");
		int num02 = input.nextInt();
		
		if (opcao == 1) {
			calculo = (num01 + num02) / 2;
			executar = 'A';
		} else if (opcao == 2) {
			calculo = num01 - num02;
			executar = 'B';
		} else if (opcao == 3) {
			calculo = num01 * num02;
			executar = 'C';
		} else if (opcao == 4) {
			calculo = num01 / num02;
			executar = 'D';
		} else {
			executar = 'E';
		}
		
		switch (executar) {
		case 'A':
			System.out.printf("A média entre os números %d e %d é: %.2f", num01, num02, calculo);
			break;
		case 'B':
			System.out.printf("A diferença entre os números %d e %d é: %.2f", num01, num02, calculo);
			break;
		case 'C':
			System.out.printf("A multiplicação entre os números %d e %d é: %.2f", num01, num02, calculo);
			break;
		case 'D':
			System.out.printf("A divisão entre os números %d e %d é: %.2f", num01, num02, calculo);
			break;
		case 'E':
			System.out.print("Opção inexistente, programa encerrado");
			break;
		default:
			
		} 
		
	}

}
