package Book;

public class KinderBoek extends Boek {
    private boolean stripBoek;

    public KinderBoek(String titel, String auteur, long ISBNNummer, Integer publicatieJaar, Boolean stripBoek) {
        super(titel, auteur, ISBNNummer, publicatieJaar);
        this.stripBoek = stripBoek;
    }

    public boolean isStripBoek() {
        return stripBoek;
    }

    public void setStripBoek(boolean stripBoek) {
        this.stripBoek = stripBoek;
    }


}
