import java.util.ArrayList;
public class CardGeneratorController {
    private CardRepository repository = new CardRepository();

    public void generateCard(String englishword, String portugueseword, String idcard){
        Card card = new Card(englishword, portugueseword, idcard);
        if(!englishword.trim().equals("")||!portugueseword.trim().equals("")) {
                repository.insert(card);
        }
        else{
            System.out.println("Cartão não cadastrado.\n");
        }
    }
    public ArrayList<Card> findCards(){
        return repository.showCards();
    }
    public ArrayList<Card> showById(String idcard){
        return repository.showCardsById(idcard);
    }
    public ArrayList<Card> showByWords(String englishwords, String portuguesewords) {
        return repository.showCardsByWords(englishwords, portuguesewords);
    }
}
