package Book;

public class ThrillerBoek extends Boek {
    private Integer leeftijdsGrens;


    public ThrillerBoek(String titel, String auteur, long ISBNNummer, Integer publicatieJaar, Integer leeftijdsGrens) {
        super(titel, auteur, ISBNNummer, publicatieJaar);
        this.leeftijdsGrens = leeftijdsGrens;

    }

    public Integer getLeeftijdsGrens() {
        return leeftijdsGrens;
    }

    public void setLeeftijdsGrens(Integer leeftijdsGrens) {
        this.leeftijdsGrens = leeftijdsGrens;
    }
}

