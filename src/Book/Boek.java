package Book;

import java.util.ArrayList;

public abstract class Boek {
    private String titel;
    private String auteur;
    private long ISBNNummer;
    private Integer publicatieJaar;

    public Boek(String titel, String auteur, long ISBNNummer, Integer publicatieJaar) {
        this.titel = titel;
        this.auteur = auteur;
        this.ISBNNummer = ISBNNummer;
        this.publicatieJaar = publicatieJaar;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public long getISBNNummer() {
        return ISBNNummer;
    }

    public void setISBNNummer(long ISBNNummer) {
        this.ISBNNummer = ISBNNummer;
    }

    public Integer getPublicatieJaar() {
        return publicatieJaar;
    }

    public void setPublicatieJaar(Integer publicatieJaar) {
        this.publicatieJaar = publicatieJaar;
    }
}
