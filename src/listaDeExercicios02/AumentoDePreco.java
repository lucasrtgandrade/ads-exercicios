package listaDeExercicios02;

import java.util.Scanner;

public class AumentoDePreco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o nome do produto que você deseja pesquisar");
        String produtoNome = input.next();

        System.out.println("Qual a venda mensal média do produto");
        float produtoVenda = input.nextFloat();

        System.out.println("Qual o preço atual do produto");
        float produtoPreco = input.nextFloat();

        float aumento01 = 0.1f;
        float aumento02 = 0.15f;
        float diminuicao = 0.2f;

        float produtoFinal;
        float produtoAumento;
        float produtoDesconto;

        if (produtoVenda < 500 && produtoPreco < 30) {
            produtoAumento = produtoPreco * aumento01;
            produtoFinal =  produtoAumento + produtoPreco;
            System.out.printf("O seu produto %s teve aumento01 de %.2f e agora custa %.2f", produtoNome, produtoAumento, produtoFinal);
        } else if ((produtoVenda >= 500 && produtoVenda < 1200) && (produtoPreco >= 30 && produtoPreco < 80)) {
            produtoAumento = produtoPreco * aumento02;
            produtoFinal =  produtoAumento + produtoPreco;
            System.out.printf("O seu produto %s teve aumento02 de %.2f e agora custa %.2f", produtoNome, produtoAumento, produtoFinal);
        } else if (produtoVenda >= 1200 && produtoPreco >= 80 ) {
            produtoDesconto = produtoPreco * diminuicao;
            produtoFinal = produtoDesconto + produtoPreco;
            System.out.printf("O seu produto %s teve redução de preço de %.2f e agora custa %.2f", produtoNome, produtoDesconto, produtoFinal);
        } else {
            System.out.print("Valor inválido");
        }
    }
}
