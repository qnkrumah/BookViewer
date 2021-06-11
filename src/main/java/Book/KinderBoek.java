package Book;

import Overzicht.Overzicht;

public class KinderBoek extends Boek {
    private String categorie;

    public KinderBoek(String titel, String auteur, Integer ISBN, Integer publicatieJaar, String categorie) {
        super(titel, auteur, ISBN, publicatieJaar);
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

}
