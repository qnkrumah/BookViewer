import Overzicht.GebruikersOverzicht;
import User.GastAccount;
import User.GebruikerAccount;

public class MainGebruiker {

    public static void main(String[] args) {


        GebruikersOverzicht Lijst = new GebruikersOverzicht();
        GebruikerAccount gebruiker1 = new GebruikerAccount("Quincy", 20, "qnkrumah", "Quincy123", 0, 1);
        GebruikerAccount gebruiker2 = new GebruikerAccount("Joy", 23, "JoyN", "Joy432", 0, 5);
        GastAccount gast = new GastAccount("Sascha", 23, true);


        Lijst.getGastaccountLijst().add(gast);
        Lijst.getGebruikersAccountlijst().add(gebruiker1);
        Lijst.getGebruikersAccountlijst().add(gebruiker2);

        for (int i = 0; i < Lijst.getGebruikersAccountlijst().size(); i++) {
            System.out.println("Gebruikersaccount " + "(" + (i+1) +")");
            System.out.println("Accountgegevens: ");
            System.out.println("Naam: " + Lijst.getGebruikersAccountlijst().get(i).getNaam());
            System.out.println("Leeftijd: " + Lijst.getGebruikersAccountlijst().get(i).getLeeftijd());
            System.out.println("Gebruikersnaam: " +Lijst.getGebruikersAccountlijst().get(i).getGebruikersNaam());
            System.out.println("Wachtwoord: " + Lijst.getGebruikersAccountlijst().get(i).getWachtwoord());
            System.out.println("Punten: " + Lijst.getGebruikersAccountlijst().get(i).getPunten());
            System.out.println("GebruikersID: " + Lijst.getGebruikersAccountlijst().get(i).getGebruikerId());
            System.out.println("");
        }

        for (int i = 0; i < Lijst.getGastaccountLijst().size(); i++) {
            System.out.println("Gastaccount " + "(" + (i+1) +")");
            System.out.println("Basisgegevens informatie: ");
            System.out.println("Naam: " + Lijst.getGastaccountLijst().get(i).getNaam());
            System.out.println("Leeftijd: "+ Lijst.getGastaccountLijst().get(i).getLeeftijd());
            System.out.println("Gast true/false: " + Lijst.getGastaccountLijst().get(i).getGuest());
        }

    }

}
