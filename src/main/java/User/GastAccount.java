package User;

import Overzicht.GebruikersOverzicht;

public class GastAccount extends Gebruiker {
    private Boolean isGuest;

    public GastAccount(String naam, Integer leeftijd, Boolean isGuest) {
        super(naam, leeftijd);
        this.isGuest = isGuest;
    }
    public Boolean getGuest() {
        return isGuest;
    }

    public void setGuest(Boolean guest) {
        isGuest = guest;
    }

    @Override
    public void printLijst() {
        GebruikersOverzicht GA = new GebruikersOverzicht();
        for (int i = 0; i < GA.getGastaccountLijst().size(); i++) {
            System.out.println("Gastaccount " + "(" + (i + 1) + ")");
            System.out.println("Basisgegevens informatie: ");
            System.out.println("Naam: " + GA.getGastaccountLijst().get(i).getNaam());
            System.out.println("Leeftijd: " + GA.getGastaccountLijst().get(i).getLeeftijd());
            System.out.println("Gast true/false: " + GA.getGastaccountLijst().get(i).getGuest());
        }
    }
}

