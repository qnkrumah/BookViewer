package User;

public class GebruikerAccount extends Gebruiker {
    private String gebruikersNaam;
    private String wachtwoord;
    private Integer punten;
    private Integer gebruikerId = 0;

    public GebruikerAccount(String naam, Integer leeftijd, String gebruikersnaam, String wachtwoord) {
        super(naam, leeftijd);
        this.gebruikersNaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.punten = 0;
        this.gebruikerId = getGebruikerId();
    }

    public String getGebruikersNaam() {
        return gebruikersNaam;
    }

    public void setGebruikersNaam(String gebruikersNaam) {
        this.gebruikersNaam = gebruikersNaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public Integer getPunten() {
        return punten;
    }

    public void setPunten(Integer punten) {
        this.punten = punten;
    }

    public Integer getGebruikerId() {
        return gebruikerId + 1;
    }

    public void setGebruikerId(Integer gebruikerId) {
        this.gebruikerId = gebruikerId;
    }
}
