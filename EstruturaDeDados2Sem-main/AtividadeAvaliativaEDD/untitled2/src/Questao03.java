import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("Escolha uma operação:");
            System.out.println("[1] Adição\n[2] Subtração\n[3] Divisão\n[4] Multiplicação\n[5] Sair");

            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= 4) {

                System.out.print("Informe o primeiro valor: ");
                double valor1 = scanner.nextDouble();
                System.out.print("Informe o segundo valor: ");
                double valor2 = scanner.nextDouble();

                double resultado = realizarOperacao(valor1, valor2, escolha);

                System.out.println("Resultado: " + resultado);

                salvarHistorico(escolha, valor1, valor2, resultado);
            } else if (escolha != 5) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);

        scanner.close();
    }

    public static double realizarOperacao(double valor1, double valor2, int operacao) {
        double resultado = 0.0;
        switch (operacao) {
            case 1:
                resultado = valor1 + valor2;
                break;
            case 2:
                resultado = valor1 - valor2;
                break;
            case 3:
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            case 4:
                resultado = valor1 * valor2;
                break;
        }
        return resultado;
    }

    public static void salvarHistorico(int operacao, double valor1, double valor2, double resultado)throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\andre_v_leal\\Documents\\historico.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            switch (operacao) {
                case 1:
                    printWriter.println(valor1+" + "+valor2+" = "+resultado);
                    break;
                case 2:
                    printWriter.println(valor1+" - "+valor2+" = "+resultado);
                    break;
                case 3:
                    printWriter.println(valor1+" / "+valor2+" = "+resultado);
                    break;
                case 4:
                    printWriter.println(valor1+" * "+valor2+" = "+resultado);
                    break;
            }

            printWriter.close();
            System.out.println("Cálculo salvo no histórico.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o histórico: ");
        }
    }
}