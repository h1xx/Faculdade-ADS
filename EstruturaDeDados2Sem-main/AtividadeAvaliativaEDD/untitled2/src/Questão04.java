import java.util.Scanner;
public class Questão04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[8];

        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print("Informe um valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i += 2) {
            vetor[i] = 2 * vetor[i + 1];
        }
        System.out.print("Vetor resultante: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        int somaRecursiva = somaVetorRecursivo(vetor, 0, vetor.length - 1);
        System.out.println("Soma dos valores do vetor (recursiva): " + somaRecursiva);

        int somaIterativa = somaVetorIterativo(vetor);
        System.out.println("Soma dos valores do vetor (iterativa): " + somaIterativa);

        scanner.close();
    }
    public static int somaVetorRecursivo(int[] vetor, int inicio, int fim) {
        if (inicio == fim) {
            return vetor[inicio];
        } else {
            int meio = (inicio + fim) / 2;
            int somaEsquerda = somaVetorRecursivo(vetor, inicio, meio);
            int somaDireita = somaVetorRecursivo(vetor, meio + 1, fim);
            return somaEsquerda + somaDireita;
        }
    }
    public static int somaVetorIterativo(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }
}

