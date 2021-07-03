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

    @Override
    public void printweergave() {
        Overzicht overzicht = new Overzicht();
        for (int i = 0; i < overzicht.getKinderboekenlijst().size(); i++) {
            System.out.println("Kinderboek Overzicht: ");
            System.out.println("Boek: " + "(" + (i + 1) + ")");
            System.out.println("");
            System.out.println("Titel: " + overzicht.getKinderboekenlijst().get(i).getTitel());
            System.out.println("Auteur: " + overzicht.getKinderboekenlijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + overzicht.getKinderboekenlijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + overzicht.getKinderboekenlijst().get(i).getPublicatieJaar());
            System.out.println("Categorie: " + overzicht.getKinderboekenlijst().get(i).getCategorie());
            System.out.println("");
        }
    }
}
