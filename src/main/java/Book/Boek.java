package Book;

public abstract class Boek {
    private String titel;
    private String auteur;
    private Integer ISBN;
    private Integer publicatieJaar;

    public Boek(String titel, String auteur, Integer ISBN, Integer publicatieJaar) {
        this.titel = titel;
        this.auteur = auteur;
        this.ISBN = ISBN;
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

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getPublicatieJaar() {
        return publicatieJaar;
    }

    public void setPublicatieJaar(Integer publicatieJaar) {
        this.publicatieJaar = publicatieJaar;
    }

    public abstract void printweergave();

}

