import java.util.ArrayList;
public class CardRepository {
    private static ArrayList<Card> cards = new ArrayList<>();

    public void insert(Card card){
        cards.add(card);
    }
    public ArrayList<Card> showCards() {
        return cards;
    }
    public ArrayList<Card> showCardsById(String idcard) {

        ArrayList<Card> filter = new ArrayList<>();
        for (Card card : cards) {
            if (idcard.equalsIgnoreCase(card.getIdcard())) {
                filter.add(card);
            }
        }
        return filter;
    }
    public ArrayList<Card> showCardsByWords(String englishwords, String portuguesewords) {

        ArrayList<Card> filter = new ArrayList<>();
        for(Card card : cards) {
            if(card.getEnglishword().toLowerCase().startsWith(englishwords.toLowerCase()) || card.getPortugueseword().toLowerCase().startsWith(portuguesewords)) {
                filter.add(card);
            }
        }
        return filter;
    }
}
