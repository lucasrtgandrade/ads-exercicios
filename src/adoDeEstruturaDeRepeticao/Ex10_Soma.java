package adoDeEstruturaDeRepeticao;

public class Ex10_Soma {
    public static void main(String[] args) {
        float divisor = 2;
        float soma = 1;

        while (divisor <= 20) {
            soma = soma + (1/divisor);
            divisor++;
        }
        System.out.println(soma);
    }
}
