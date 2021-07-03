package User;

import Overzicht.GebruikersOverzicht;
import Overzicht.Overzicht;
import java.util.Scanner;

public class Login {

    public static void loginScherm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom.");
        System.out.println("Voer (1) in om in te loggen met je Gebruikersaccount, of (2) om gebruik te maken van een Gastaccount:");

        int selectie = scanner.nextInt();
        if (selectie == 1) {
            openLogin();
        } else if (selectie == 2) {
            openMenuGastaccount();
        }
    }

    public static void openLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer uw gebruikersnaam in: ");
        String userName = scanner.nextLine();
        System.out.println("Voer uw wachtwoord in: ");
        String passWord = scanner.nextLine();
        checkLogin(userName, passWord);
    }

    public static void checkLogin(String userName, String passWord) throws IndexOutOfBoundsException{
        GebruikersOverzicht gebruiker = new GebruikersOverzicht();
        boolean check = true;
        for (int i = 0; i < gebruiker.getGebruikersAccountlijst().size(); i++) {
            while(check){
                if(userName.equals(gebruiker.getGebruikersAccountlijst().get(i).getGebruikersNaam()) && passWord.equals(gebruiker.getGebruikersAccountlijst().get(i).getWachtwoord())){
                    check = false;
                    openMenugebruikersaccount();
                } else {
                    i++;
                }
            }
        }
    }

    public static void openMenugebruikersaccount() { // Toegangscherm voor de gebruikers die inloggen met een account.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij de bookviewer");
        System.out.println("1) Boek toevoegen");
        System.out.println("2) Lijst boeken");
        System.out.println("3) Lijst gebruikers (enkel toegankelijk voor de developers)");
        System.out.println("Maak je keuze:");
        int selectie = scanner.nextInt();
        menuSelectie(selectie);
    }

    public static void openMenuGastaccount() { //Toegangscherm voor de gebruikers die inloggen met een Gastaccount.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij de bookviewer");
        System.out.println("1) Boek toevoegen");
        System.out.println("2) Lijst boeken");
        System.out.println("Maak je keuze:");
        int selectie = scanner.nextInt();
        menuSelectie(selectie);
    }

    public static void menuSelectie(int selectie) {
        switch (selectie) {
            case 1 -> {
                System.out.println("Ik werk helaas nog niet");
            }
            case 2 -> {
                System.out.println("Lijst van de verschillende boeken:");
                Overzicht.lijstMenu();
            }
            case 3 -> {
                System.out.println("Ben je een developer? ");
                Scanner invoer = new Scanner(System.in);
                String keuze = invoer.nextLine();
                if (keuze.equals("Ja") || keuze.equals("ja")) {
                    System.out.println("Voer het developer wachtwoord in:");
                    String ww = invoer.nextLine();
                    if (ww.equals("BookviewerTM")) {
                        System.out.println("Lijst van alle gebruikers:");
                        GebruikersOverzicht.lijstMenu();
                    } else {
                        System.out.println("Geen toegang. Het developer wachtwoord klopt niet, start het systeem opnieuw op!");
                    }
                }
            }
        }

    }
}