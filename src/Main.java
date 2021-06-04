import Book.Boek;
import Book.KinderBoek;
import Book.ThrillerBoek;
import Overzicht.Overzicht;

public class Main {

    public static void main(String[] args) {
        Boek kinderboek = new KinderBoek("Dolfje", "Carry Surfplank", 123, 1921, false);
        Boek kinderboek2 = new KinderBoek("Hoe overleef ik mezelf", "Annet schaap", 98765, 2008, false);
        Boek thriller = new ThrillerBoek ("Griezelbus", "Quincy", 756475, 2011, 13,true);
        Overzicht lijst = new Overzicht();

        lijst.getBoekenLijst().add(kinderboek);
        lijst.getBoekenLijst().add(kinderboek2);
        lijst.getBoekenLijst().add(thriller);

//        /*
//        Dit laat de grootte zien van de ArrayList
//         */
//        System.out.println(lijst.getBoekenLijst().size());
//
//        /*
//        Dit laat zien wat de titel is van de eerste boek in de ArrayList dus 0
//         */
//        System.out.println(lijst.getBoekenLijst().get(0).getTitel());
//
//        /*
//        Dit laat zien wat de auteur is van het 2e boek
//         */
//        System.out.println(lijst.getBoekenLijst().get(1).getAuteur());

        for (int i = 0; i < lijst.getBoekenLijst().size(); i++) {
            System.out.println("Id: " + (i));
            System.out.println("Titel: " + lijst.getBoekenLijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getBoekenLijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getBoekenLijst().get(i).getISBNNummer());
            System.out.println("Publicatie Jaar: " + lijst.getBoekenLijst().get(i).getPublicatieJaar());
        }
    }
}
