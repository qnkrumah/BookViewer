package Book;

import Overzicht.Overzicht;

public class ThrillerBoek extends Boek {

    private Integer leeftijdsGrens;

    public ThrillerBoek(String titel, String auteur, Integer ISBN, Integer publicatieJaar, Integer leeftijdsGrens) {
        super(titel, auteur, ISBN, publicatieJaar);
        this.leeftijdsGrens = leeftijdsGrens;
    }
    public Integer getLeeftijdsGrens() {
        return leeftijdsGrens;
    }

    public void setLeeftijdsGrens(Integer leeftijdsGrens) {
        this.leeftijdsGrens = leeftijdsGrens;
    }

    @Override
    public void printweergave() {
        Overzicht overzicht = new Overzicht();
        for (int i = 0; i < overzicht.getThrillerLijst().size(); i++) {
            System.out.println("Thriller Overzicht: ");
            System.out.println("Boek: " + "(" + (i + 1) + ")");
            System.out.println("");
            System.out.println("Titel: " + overzicht.getThrillerLijst().get(i).getTitel());
            System.out.println("Auteur: " + overzicht.getThrillerLijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + overzicht.getThrillerLijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + overzicht.getThrillerLijst().get(i).getPublicatieJaar());
            System.out.println("Leeftijdsgrens: " + overzicht.getThrillerLijst().get(i).getLeeftijdsGrens());
            System.out.println("");
        }
    }
}

