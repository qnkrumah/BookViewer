import Book.KinderBoek;
import Book.ThrillerBoek;
import Book.WoordenBoek;
import Overzicht.*;
import User.GastAccount;
import User.GebruikerAccount;
import User.Login;

public class Main {

    public static void main(String[] args) {
        KinderBoek Dolf = new KinderBoek("Dolfje Weerwolfje", "Paul van Loon", 123, 2002, "Cartoon");
        KinderBoek Mezelf = new KinderBoek("Hoe overleef ik mezelf", "Francine Oomen", 98765, 2005, "Prent");

        ThrillerBoek IT = new ThrillerBoek ("IT ", "Stephen King", 756475, 1986, 16);
        ThrillerBoek Haunting = new ThrillerBoek ("The Haunting of Hill House ", "Shirley Jackson", 773838, 1959, 16);

        WoordenBoek woordenBoek = new WoordenBoek("Van Dale", "Dale",1224,2003,"NL",2);

        Overzicht lijst = new Overzicht();
        lijst.getKinderboekenlijst().add(Dolf);             // Voegt Kinderboek toe aan het Overzicht
        lijst.getKinderboekenlijst().add(Mezelf);           // Voegt Kinderboek toe aan het Overzicht
        lijst.getThrillerLijst().add(Haunting);             // Voegt Thrillerboek toe aan het Overzicht
        lijst.getThrillerLijst().add(IT);                   // Voegt Thrillerboek toe aan het Overzicht
        lijst.getWoordenboeklijst().add(woordenBoek);

        GebruikersOverzicht gebruiker = new GebruikersOverzicht();
        GebruikerAccount Q = new GebruikerAccount("Quincy", 20, "qnkrumah", "Simba");
        GebruikerAccount J = new GebruikerAccount("Joy", 23, "JoyN", "Bentley");
        GebruikerAccount Jor = new GebruikerAccount("Jordi", 24, "Jordi", "Password");
        GastAccount gast = new GastAccount("Sascha", 23, true);

        gebruiker.getGastaccountLijst().add(gast);             // Voegt Gastaccount toe aan de lijst met Gastaccounts (enkel toegankelijk voor developer)
        gebruiker.getGebruikersAccountlijst().add(Q);          // Voegt Gebruikersaccount toe aan de lijst met GebruikersAccounts (enkel toegankelijk voor developer)
        gebruiker.getGebruikersAccountlijst().add(J);          // Voegt Gebruikersaccount toe aan de lijst met GebruikersAccounts (enkel toegankelijk voor developer)
        gebruiker.getGebruikersAccountlijst().add(Jor);        // Voegt Gebruikersaccount toe aan de lijst met GebruikersAccounts (enkel toegankelijk voor developer)

        Login.loginScherm();
    }
}