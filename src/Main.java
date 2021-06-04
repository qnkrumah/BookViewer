import Book.Boek;
import Book.KinderBoek;
import Book.ThrillerBoek;
import Book.WoordenBoek;
import Overzicht.Overzicht;
import User.GastAccount;
import User.Gebruiker;
import User.GebruikerAccount;

public class Main {

    public static void main(String[] args) {
        KinderBoek kinderboek = new KinderBoek("Dolfje", "Carry Surfplank", 123, 1921, "Strip");
        KinderBoek kinderboek2 = new KinderBoek("Hoe overleef ik mezelf", "Annet schaap", 98765, 2008, "Prent");

        ThrillerBoek thriller = new ThrillerBoek ("Griezelbus", "Quincy", 756475, 2011, 13);

        WoordenBoek woordenBoek = new WoordenBoek("Van Dale", "Dale",1224,2003,"NL",2);

        Overzicht lijst = new Overzicht();


        GebruikerAccount gebruikersacc = new GebruikerAccount("Quincy",20,"qnkrumah","Quincy123",0,0001);
        GastAccount gast = new GastAccount("Sasha",23,true);





        lijst.getKinderboekenlijst().add(kinderboek);           // Voegt kinderboeken toe aan het Overzicht
        lijst.getKinderboekenlijst().add(kinderboek2);          // Voegt kinderboeken toe aan het Overzicht

        lijst.getThrillerLijst().add(thriller);                 // Voegt Thrillerboeken toe aan het Overzicht

        lijst.getWoordenboeklijst().add(woordenBoek);           // Voegt Woordenboeken toe aan het Overzicht



        gebruikersacc.getGebruikersLijst().add(gebruikersacc);
        gast.getGebruikersAccountlijst().add(gast);


        for (int i = 0; i < lijst.getBoekenLijst().size(); i++) {
            System.out.println("Boek overzicht: ");
            System.out.println("");
            System.out.println("Boek: " + (i));
            System.out.println("Titel: " + lijst.getBoekenLijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getBoekenLijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getBoekenLijst().get(i).getISBNNummer());
            System.out.println("Publicatie Jaar: " + lijst.getBoekenLijst().get(i).getPublicatieJaar());
            System.out.println("");
        }

        for (int i = 0; i < lijst.getKinderboekenlijst().size(); i++) {
            System.out.println("Kinderboek Overzicht: ");
            System.out.println("");
            System.out.println("Boek: " + (i));
            System.out.println("Titel: " + lijst.getKinderboekenlijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getKinderboekenlijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getKinderboekenlijst().get(i).getISBNNummer());
            System.out.println("Publicatie Jaar: " + lijst.getKinderboekenlijst().get(i).getPublicatieJaar());
            System.out.println("Categorie: " + lijst.getKinderboekenlijst().get(i).getCategorie()) ;
            System.out.println("");
        }

        for (int i = 0; i < lijst.getThrillerLijst().size(); i++) {
            System.out.println("Thriller Overzicht: ");
            System.out.println("");
            System.out.println("Boek: " + (i));
            System.out.println("Titel: " + lijst.getThrillerLijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getThrillerLijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getThrillerLijst().get(i).getISBNNummer());
            System.out.println("Publicatie Jaar: " + lijst.getThrillerLijst().get(i).getPublicatieJaar());
            System.out.println("Leeftijdsgrens: " + lijst.getThrillerLijst().get(i).getLeeftijdsGrens()) ;
            System.out.println("");
        }

        for (int i = 0; i < lijst.getWoordenboeklijst().size(); i++) {
            System.out.println("Woordenboek Overzicht: ");
            System.out.println("");
            System.out.println("Boek: " + (i));
            System.out.println("Id: " + (i));
            System.out.println("Titel: " + lijst.getWoordenboeklijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getWoordenboeklijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getWoordenboeklijst().get(i).getISBNNummer());
            System.out.println("Publicatie Jaar: " + lijst.getWoordenboeklijst().get(i).getPublicatieJaar());
            System.out.println("Taal: " +lijst.getWoordenboeklijst().get(i).getTaal());
            System.out.println("Editie: " +lijst.getWoordenboeklijst().get(i).getEditie());
        }

//        for (int i = 0; i < .getGebruikersLijst().size(); i++) {
//            System.out.println("Basisgegevens informatie: ");
//            System.out.println("");
//            System.out.println("Naam: " + (i));
//            System.out.println("Leeftijd: " + (i));

//        }

        for (int i = 0; i < gebruikersacc.getGebruikersAccountlijst().size(); i++) {
            System.out.println("Gebruikersgegevens: ");
            System.out.println("");
            System.out.println("Naam: " + (i));
            System.out.println("Leeftijd: " + (i));
            System.out.println("Gebruikersnaam: " +(i));
            System.out.println("Wachtwoord: " +(i));
            System.out.println("Punten: " +(i));
            System.out.println("GebruikersId: " +(i+1));

        }


    }
}
