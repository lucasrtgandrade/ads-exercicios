package adoDeEstruturaDeRepeticao;

/* Faça um programa que mostre todos os números
inteiros de 1 a 50. Use o laço WHILE
 */

public class Ex01_NumeroInteiros {
    public static void main(String[] args) {

        int contadora = 0;
        int numeros = 1;

        while(contadora < 50) {
            System.out.println("Número " + numeros);
            contadora = contadora + 1;
            numeros++;
        }
    }
}
