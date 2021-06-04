import Overzicht.GebruikersOverzicht;
import User.GastAccount;
import User.GebruikerAccount;

public class MainGebruiker {

    public static void main(String[] args) {


        GebruikersOverzicht Lijst = new GebruikersOverzicht();


        GebruikerAccount gebruikersAccount = new GebruikerAccount("Quincy", 20, "qnkrumah", "Quincy123", 0, 1);
        GastAccount gast = new GastAccount("Sasha", 23, true);


        Lijst.getGastaccountLijst().add(gast);
        Lijst.getGebruikersAccountlijst().add(gebruikersAccount);


        //        for (int i = 0; i < .getGebruikersLijst().size(); i++) {
//            System.out.println("Basisgegevens informatie: ");
//            System.out.println("");
//            System.out.println("Naam: " + (i));
//            System.out.println("Leeftijd: " + (i));

//        }

        for (int i = 0; i < Lijst.getGebruikersAccountlijst().size(); i++) {
            System.out.println("Gebruikersgegevens: ");
            System.out.println("");
            System.out.println("Naam: " + Lijst.getGebruikersAccountlijst().get(i).getNaam());
            System.out.println("Leeftijd: " + Lijst.getGebruikersAccountlijst().get(i).getLeeftijd());
            System.out.println("Gebruikersnaam: " +Lijst.getGebruikersAccountlijst().get(i).getGebruikersNaam());
            System.out.println("Wachtwoord: " + Lijst.getGebruikersAccountlijst().get(i).getWachtwoord());
            System.out.println("Punten: " + Lijst.getGebruikersAccountlijst().get(i).getPunten());
            System.out.println("GebruikersID: " + Lijst.getGebruikersAccountlijst().get(i).getGebruikerId());

        }


    }

}
