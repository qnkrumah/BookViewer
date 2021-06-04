package Book;

public class ThrillerBoek extends Boek {
    private Integer leeftijdsGrens;
    private Boolean vormVanReeks;


    public ThrillerBoek(String titel, String auteur, long ISBNNummer, Integer publicatieJaar, Integer leeftijdsGrens, Boolean vormVanReeks) {
        super(titel, auteur, ISBNNummer, publicatieJaar);
        this.leeftijdsGrens = leeftijdsGrens;
        this.vormVanReeks = vormVanReeks;
    }

    public Integer getLeeftijdsGrens() {
        return leeftijdsGrens;
    }

    public void setLeeftijdsGrens(Integer leeftijdsGrens) {
        this.leeftijdsGrens = leeftijdsGrens;
    }

    public Boolean getVormVanReeks() {
        return vormVanReeks;
    }

    public void setVormVanReeks(Boolean vormVanReeks) {
        this.vormVanReeks = vormVanReeks;
    }
}
