public class Card {
    private String englishword;
    private String portugueseword;
    private String idcard;

    public String getEnglishword() {
        return englishword;
    }

    public Card (){}
    public Card (String englishword, String portugueseword, String idcard){
        this.englishword = englishword;
        this.portugueseword = portugueseword;
        this.idcard = idcard;
    }

    public void setEnglishword(String englishword) {
        this.englishword = englishword;
    }

    public String getPortugueseword() {
        return portugueseword;
    }

    public void setPortugueseword(String portugueseword) {
        this.portugueseword = portugueseword;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIdcard() {
        return idcard;
    }
}
