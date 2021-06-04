import Book.KinderBoek;
import Book.ThrillerBoek;
import Book.WoordenBoek;
import Overzicht.Overzicht;
import User.GastAccount;
import User.GebruikerAccount;
import Overzicht.GebruikersOverzicht;

public class MainBoeken {

    public static void main(String[] args) {

        KinderBoek Dolf = new KinderBoek("Dolfje Weerwolfje", "Paul van Loon", 123, 2002, "Cartoon");
        KinderBoek Mezelf = new KinderBoek("Hoe overleef ik mezelf", "Francine Oomen", 98765, 2005, "Prent");

        ThrillerBoek IT = new ThrillerBoek ("IT ", "Stephen King", 756475, 1986, 16);

        WoordenBoek woordenBoek = new WoordenBoek("Van Dale", "Dale",1224,2003,"NL",2);

        Overzicht lijst = new Overzicht();


        lijst.getKinderboekenlijst().add(Dolf);           // Voegt kinderboeken toe aan het Overzicht
        lijst.getKinderboekenlijst().add(Mezelf);          // Voegt kinderboeken toe aan het Overzicht

        lijst.getThrillerLijst().add(IT);                 // Voegt Thrillerboeken toe aan het Overzicht

        lijst.getWoordenboeklijst().add(woordenBoek);           // Voegt Woordenboeken toe aan het Overzicht


        for (int i = 0; i < lijst.getBoekenLijst().size(); i++) {
            System.out.println("Boek overzicht: ");
            System.out.println("Boek: " + (i));
            System.out.println("");
            System.out.println("Titel: " + lijst.getBoekenLijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getBoekenLijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getBoekenLijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + lijst.getBoekenLijst().get(i).getPublicatieJaar());
            System.out.println("");
        }

        for (int i = 0; i < lijst.getKinderboekenlijst().size(); i++) {
            System.out.println("Kinderboek Overzicht: ");
            System.out.println("Boek: " + (i));
            System.out.println("");
            System.out.println("Titel: " + lijst.getKinderboekenlijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getKinderboekenlijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getKinderboekenlijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + lijst.getKinderboekenlijst().get(i).getPublicatieJaar());
            System.out.println("Categorie: " + lijst.getKinderboekenlijst().get(i).getCategorie()) ;
            System.out.println("");
        }

        for (int i = 0; i < lijst.getThrillerLijst().size(); i++) {
            System.out.println("Thriller Overzicht: ");
            System.out.println("Boek: " + (i));
            System.out.println("");
            System.out.println("Titel: " + lijst.getThrillerLijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getThrillerLijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getThrillerLijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + lijst.getThrillerLijst().get(i).getPublicatieJaar());
            System.out.println("Leeftijdsgrens: " + lijst.getThrillerLijst().get(i).getLeeftijdsGrens()) ;
            System.out.println("");
        }

        for (int i = 0; i < lijst.getWoordenboeklijst().size(); i++) {
            System.out.println("Woordenboek Overzicht: ");
            System.out.println("Boek: " + (i));
            System.out.println("");
            System.out.println("Id: " + (i));
            System.out.println("Titel: " + lijst.getWoordenboeklijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getWoordenboeklijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getWoordenboeklijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + lijst.getWoordenboeklijst().get(i).getPublicatieJaar());
            System.out.println("Taal: " +lijst.getWoordenboeklijst().get(i).getTaal());
            System.out.println("Editie: " +lijst.getWoordenboeklijst().get(i).getEditie());
        }

    }
}
