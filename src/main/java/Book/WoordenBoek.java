package Book;

import Overzicht.Overzicht;

public class WoordenBoek extends Boek{
    private String taal;
    private Integer editie;

    public WoordenBoek(String titel, String auteur, Integer ISBN, Integer publicatieJaar, String taal, Integer editie) {
        super(titel, auteur, ISBN, publicatieJaar);
        this.taal = taal;
        this.editie = editie;
    }

    public String getTaal() {
        return taal;
    }

    public void setTaal(String taal) {
        this.taal = taal;
    }

    public Integer getEditie() {
        return editie;
    }

    public void setEditie(Integer editie) {
        this.editie = editie;
    }

    @Override
    public void printweergave() {
        Overzicht overzicht = new Overzicht();
        for (int i = 0; i < overzicht.getWoordenboeklijst().size(); i++) {
            System.out.println("Woordenboek Overzicht: ");
            System.out.println("Boek: " + "(" + (i + 1) + ")");
            System.out.println("");
            System.out.println("Titel: " + overzicht.getWoordenboeklijst().get(i).getTitel());
            System.out.println("Auteur: " + overzicht.getWoordenboeklijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + overzicht.getWoordenboeklijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + overzicht.getWoordenboeklijst().get(i).getPublicatieJaar());
            System.out.println("Taal: " + overzicht.getWoordenboeklijst().get(i).getTaal());
            System.out.println("Editie: " + overzicht.getWoordenboeklijst().get(i).getEditie());
        }
    }
}
