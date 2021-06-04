package Book;

public class KinderBoek extends Boek {
    private String categorie;

    public KinderBoek(String titel, String auteur, long ISBNNummer, Integer publicatieJaar, String categorie) {
        super(titel, auteur, ISBNNummer, publicatieJaar);
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
