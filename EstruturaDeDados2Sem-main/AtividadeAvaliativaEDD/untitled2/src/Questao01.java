import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vendasDiarias = new double[7];

        for (int i = 0; i < vendasDiarias.length; i++) {
            System.out.print("Informe o valor da venda do dia " + (i + 1) + ": ");
            vendasDiarias[i] = scanner.nextDouble();
        }
        double somaVendas = 0;

        for (double venda : vendasDiarias) {
            somaVendas += venda;
        }
        double mediaVendas = somaVendas / vendasDiarias.length;
        double maiorVenda = vendasDiarias[0];
        double menorVenda = vendasDiarias[0];
        int diaMaiorVenda = 1;
        int diaMenorVenda = 1;

        for (int i = 1; i < vendasDiarias.length; i++) {
            if (vendasDiarias[i] > maiorVenda) {
                maiorVenda = vendasDiarias[i];
                diaMaiorVenda = i + 1;
            }
            if (vendasDiarias[i] < menorVenda) {
                menorVenda = vendasDiarias[i];
                diaMenorVenda = i + 1;
            }
        }
        System.out.println("Valor médio das vendas da semana: " + mediaVendas);
        System.out.println("Dia com maior valor de venda: Dia " + diaMaiorVenda + " - R$" + maiorVenda);
        System.out.println("Dia com menor valor de venda: Dia " + diaMenorVenda + " - R$" + menorVenda);
        System.out.println("Soma das vendas da semana: R$" + somaVendas);

        scanner.close();
    }
}