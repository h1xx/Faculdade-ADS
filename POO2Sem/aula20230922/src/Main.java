import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CardView view = new CardView(input);
        view.viewMenu();
        input.close();
    }
}