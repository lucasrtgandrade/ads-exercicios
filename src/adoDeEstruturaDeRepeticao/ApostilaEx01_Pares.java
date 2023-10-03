package adoDeEstruturaDeRepeticao;

public class ApostilaEx01_Pares {
    public static void main(String[] args) {
        int pares = 1;
        while (pares <= 100) {
            if(pares %2 == 0){
                System.out.println(pares);
                pares++;
            }
            pares++;
        }
    }
}
