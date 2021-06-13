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
        WoordenBoek woordenBoek = new WoordenBoek("Van Dale", "Dale",1224,2003,"NL",2);
        Overzicht lijst = new Overzicht();
        lijst.getKinderboekenlijst().add(Dolf);           // Voegt kinderboeken toe aan het Overzicht
        lijst.getKinderboekenlijst().add(Mezelf);          // Voegt kinderboeken toe aan het Overzicht
        lijst.getThrillerLijst().add(IT);                 // Voegt Thrillerboeken toe aan het Overzicht
        lijst.getWoordenboeklijst().add(woordenBoek);

        GebruikersOverzicht gebruiker = new GebruikersOverzicht();
        GebruikerAccount gebruiker1 = new GebruikerAccount("Quincy", 20, "qnkrumah", "Quincy123", 0, 1);
        GebruikerAccount gebruiker2 = new GebruikerAccount("Joy", 23, "JoyN", "Joy432", 0, 5);
        GebruikerAccount gebruiker3 = new GebruikerAccount("Jordi", 23, "Jordi", "pass", 0, 5);
        GastAccount gast = new GastAccount("Sascha", 23, true);

        gebruiker.getGastaccountLijst().add(gast);
        gebruiker.getGebruikersAccountlijst().add(gebruiker1);
        gebruiker.getGebruikersAccountlijst().add(gebruiker2);
        gebruiker.getGebruikersAccountlijst().add(gebruiker3);

        Login.loginScherm();
    }
}