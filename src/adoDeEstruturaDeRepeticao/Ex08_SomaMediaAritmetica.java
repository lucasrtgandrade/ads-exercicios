package adoDeEstruturaDeRepeticao;

public class Ex08_SomaMediaAritmetica {
    public static void main(String[] args) {

        int soma = 0;
        int divisao = 0;

        for (int i = 13; i < 73; i++) {
            if (i % 2 == 0) {
                soma = soma + i;
                divisao++;
            }
        }

        System.out.printf("A soma dos números pares entre 13 a 73 é %d\nDividido pela quantidade de %d números pares\nTem média aritmética de %d", soma, divisao, (soma/divisao));
    }
}
