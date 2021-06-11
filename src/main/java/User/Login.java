package User;

import Overzicht.GebruikersOverzicht;
import Overzicht.Overzicht;

import java.util.Scanner;

public class Login {

    public static void loginScherm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom.");
        System.out.println("Voer (1) in om in te loggen met je gebruikersaccount, of (2) om gebruik te maken van een gast account:");

        int selectie = scanner.nextInt();
        if (inlogSelectie(selectie) == 1){
            openLogin();
        } else if (inlogSelectie(selectie) == 2){
            openMenuGastaccount();
        }
    }

    public static int inlogSelectie(int selectie){
        if (selectie == 1){
            return 1;
        } else {
            return 2;
        }
    }

    public static void menuSelectie(int selectie){
        switch (selectie) {
            case 1 -> {
                System.out.println("Ben je een developer? ");
                Scanner invoer = new Scanner(System.in);
                String keuze = invoer.nextLine();
                if(keuze.equals("Ja") || keuze.equals("ja")) {
                    System.out.println("Voer het developer wachtwoord in:");
                    String ww = invoer.nextLine();
                    if(ww.equals("BookviewerTM")) {
                        System.out.println("Lijst van alle gebruikers:");
                        GebruikersOverzicht.lijstMenu();
                    }
                    else{
                        System.out.println("Het developer wachtwoord klopt niet, start het systeem opnieuw op!");
                    }
                }
                else{
                    System.out.println("Geen toegang!!");
                }
            }
            case 2 -> {
                System.out.println("Lijst van de verschillende boeken:");
                Overzicht.lijstMenu();
            }
            case 3 -> System.out.println("Optie 3");
        }

    }

    public static void openMenugebruikersaccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij de bookviewer");
        System.out.println("1) Lijst gebruikers");
        System.out.println("2) Lijst boeken");
        System.out.println("Maak je keuze:");
        int selectie = scanner.nextInt();
        menuSelectie(selectie);
    }

    public static void openMenuGastaccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij de bookviewer");
        System.out.println("2) Lijst boeken");
        System.out.println("Maak je keuze:");
        int selectie = scanner.nextInt();
        menuSelectie(selectie);
    }

    public static void openLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String userName = scanner.nextLine();
        System.out.println("Password: ");
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
}