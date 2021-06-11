package Overzicht;

import User.GastAccount;
import User.GebruikerAccount;
import java.util.ArrayList;
import java.util.Scanner;

public class GebruikersOverzicht {

    private static ArrayList<User.GastAccount> gastaccountLijst = new ArrayList<>();
    private static ArrayList<User.GebruikerAccount> gebruikersAccountlijst = new ArrayList<>();

    public GebruikersOverzicht() {
    }


    public ArrayList<GastAccount> getGastaccountLijst() {
        return gastaccountLijst;
    }

    public ArrayList<GebruikerAccount> getGebruikersAccountlijst() {
        return gebruikersAccountlijst;
    }

    @Override
    public String toString() {
        return "Overzicht{" +
                "boekenLijst=" + gebruikersAccountlijst +
                '}';
    }

    public void gebruikerAccountLijst() {
        for (int i = 0; i < getGebruikersAccountlijst().size(); i++) {
            System.out.println("Gebruikersaccount " + "(" + (i + 1) + ")");
            System.out.println("Accountgegevens: ");
            System.out.println("Naam: " + getGebruikersAccountlijst().get(i).getNaam());
            System.out.println("Leeftijd: " + getGebruikersAccountlijst().get(i).getLeeftijd());
            System.out.println("Gebruikersnaam: " + getGebruikersAccountlijst().get(i).getGebruikersNaam());
            System.out.println("Wachtwoord: " + getGebruikersAccountlijst().get(i).getWachtwoord());
            System.out.println("Punten: " + getGebruikersAccountlijst().get(i).getPunten());
            System.out.println("GebruikersID: " + getGebruikersAccountlijst().get(i).getGebruikerId());
            System.out.println("");
        }
    }

    public void gastAcocuntLijst() {
        for (int i = 0; i < getGastaccountLijst().size(); i++) {
            System.out.println("Gastaccount " + "(" + (i + 1) + ")");
            System.out.println("Basisgegevens informatie: ");
            System.out.println("Naam: " + getGastaccountLijst().get(i).getNaam());
            System.out.println("Leeftijd: " + getGastaccountLijst().get(i).getLeeftijd());
            System.out.println("Gast true/false: " + getGastaccountLijst().get(i).getGuest());
        }
    }

    public static void lijstMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) voor lijst met gebruikerAccounts:");
        System.out.println("2) voor lijst met gastAccounts:");
        int selectie = scanner.nextInt();
        lijstSelectie(selectie);
    }

    public static void lijstSelectie(int selectie) {
        GebruikersOverzicht overzicht = new GebruikersOverzicht();
        switch (selectie) {
            case 1 -> overzicht.gebruikerAccountLijst();
            case 2 -> overzicht.gastAcocuntLijst();
        }
    }

}