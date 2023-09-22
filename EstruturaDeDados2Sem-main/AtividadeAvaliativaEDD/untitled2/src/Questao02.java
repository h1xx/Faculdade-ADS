import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] celaBraille = new int[3][2];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print("Informe o valor (0 ou 1) para o ponto " + (linha * 2 + coluna + 1) + ": ");
                celaBraille[linha][coluna] = scanner.nextInt();
            }
        }
        int pontosElevados = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                if (celaBraille[linha][coluna] == 1) {
                    pontosElevados++;
                }
            }
        }
        System.out.println("Quantidade de pontos elevados: " + pontosElevados);

        boolean representaA = (pontosElevados == 1 && celaBraille[0][0] == 1);
        if (representaA){
            System.out.println("A cela Braille representa a letra 'A'");
        }
        else{
            System.out.println("A cela Braille não representa a letra 'A'");
        }
        scanner.close();
    }
}
