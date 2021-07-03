package User;

import Overzicht.GebruikersOverzicht;

public class GebruikerAccount extends Gebruiker {
    private String gebruikersNaam;
    private String wachtwoord;

    public GebruikerAccount(String naam, Integer leeftijd, String gebruikersnaam, String wachtwoord) {
        super(naam, leeftijd);
        this.gebruikersNaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
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

    @Override
    public void printLijst() {
        GebruikersOverzicht GE = new GebruikersOverzicht();
        for (int i = 0; i < GE.getGebruikersAccountlijst().size(); i++) {
            System.out.println("Gebruikersaccount " + "(" + (i + 1) + ")");
            System.out.println("Accountgegevens: ");
            System.out.println("Naam: " + GE.getGebruikersAccountlijst().get(i).getNaam());
            System.out.println("Leeftijd: " + GE.getGebruikersAccountlijst().get(i).getLeeftijd());
            System.out.println("Gebruikersnaam: " + GE.getGebruikersAccountlijst().get(i).getGebruikersNaam());
            System.out.println("Wachtwoord: " + GE.getGebruikersAccountlijst().get(i).getWachtwoord());
            System.out.println("");
        }
    }
}
