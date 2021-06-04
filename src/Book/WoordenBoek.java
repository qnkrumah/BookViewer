package Book;

public class WoordenBoek extends Boek{
    private String taal;
    private Integer editie;

    public WoordenBoek(String titel, String auteur, long ISBNNummer, Integer publicatieJaar, String taal, Integer editie) {
        super(titel, auteur, ISBNNummer, publicatieJaar);
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
}
