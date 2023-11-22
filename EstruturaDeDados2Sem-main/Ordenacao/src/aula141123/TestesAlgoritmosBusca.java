package aula141123;

public class TestesAlgoritmosBusca {
    public static void main(String[] args) {
        int indice = 0;
        int[] vetorX = Busca.criaVetorEmbaralhado(10000000);
        System.out.println("Inicio com 10 casas: \n");
//Inicio da Busca
        System.out.println("Inico da buscaLinearV1: ");
        long tempoIni = System.currentTimeMillis();
        indice = Busca.buscaLinearV1(vetorX, 7);
        long tempoFim = System.currentTimeMillis();
        System.out.println("Tempo da Busca: " + ((long)(tempoFim - tempoIni)));
        System.out.println("Indice: " + indice +"\n");
    }
}
