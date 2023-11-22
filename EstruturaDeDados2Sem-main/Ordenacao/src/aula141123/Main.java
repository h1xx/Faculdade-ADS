package aula141123;

public class Main {
    public static void main(String args[]) {

        int[]vetor = {1, 5, 7, 56, 8, 61, 52, 29, 45, 21, 3, 4, 9, 51, 6};

        System.out.println("Iniciando...");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + ", ");
        }
        Ordenacao.quickSort(vetor);

        System.out.println("\nApós processamento...");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + ", ");
        }
    }
}
