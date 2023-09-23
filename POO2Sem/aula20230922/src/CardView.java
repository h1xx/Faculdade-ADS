import java.util.ArrayList;
import java.util.Scanner;
public class CardView {
    private CardGeneratorController controller = new CardGeneratorController();
    private Scanner input;

    public CardView(Scanner input) {
        this.input = input;
    }

    public void viewMenu() {
        int menu = -1;
        System.out.println("MENU");
        while (menu != 5) {
            System.out.println("1 - Cadastrar cartão");
            System.out.println("2 - Listar cartão");
            System.out.println("3 - Listar cartão pelo número");
            System.out.println("4 - Listar cartão pela frase");
            System.out.println("5 - Sair");
            menu = Integer.parseInt(input.nextLine());
            optionSettings(menu);
        }

    }

    public void optionSettings(int option) {
        switch (option) {
            case 1:
                cardGenerator();
                break;
            case 2:
                showCards();
                break;
            case 3:
                showCardsById();
                break;
            case 4:
                showCardsByWords();
                break;
            case 5:
                System.out.println("Obrigado, volte sempre");
                break;
            default:
                System.out.println("Opcão inválida");
                break;
        }
    }
    public void cardGenerator(){
        System.out.println("~~ CADASTRO DE CARTÃO ~~");
        System.out.println("Digite uma palavra ou frase em inglês: ");
        String englishword = input.nextLine();
        System.out.println("Digite a tradução da palavra ou frase: ");
        String portugueseword = input.nextLine();
        System.out.println("Digite o número de identificação do cartão: ");
        String idcard = input.nextLine();

        controller.generateCard(englishword, portugueseword, idcard);
    }
    public void showCards() {
        System.out.println("~~ LISTA DE TODOS OS CARDS ~~ ");
        show(controller.findCards());
    }
    public void show(ArrayList<Card> cards) {
        for (Card card : cards) {
            StringBuilder builder = new StringBuilder();
            builder.append("Frase em inglês:\n").append(card.getEnglishword()).append("\n")
                    .append("Frase em português: \n").append(card.getPortugueseword()).append("\n")
                    .append("Identificação do cartão: \n").append(card.getIdcard()).append("\n");
            System.out.println(builder.toString());
        }
    }
    public void showCardsById(){
        System.out.println("~~ LISTA DE CARTÃO POR IDENTIFICAÇÃO ~~");
        System.out.println("Informe o identificador do produto de interesse");
        String productid = input.nextLine();
        show(controller.showById(productid));
    }
    public void showCardsByWords(){
        System.out.println("~~ LISTA DE CARTÃO POR FRASE ~~");
        System.out.println("Informe alguma palavra ou frase do cartão");
        String word= input.nextLine();
        show(controller.showByWords(word, word));
    }

}
