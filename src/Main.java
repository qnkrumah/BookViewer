import Book.Boek;
import Book.KinderBoek;
import Book.ThrillerBoek;
import Overzicht.Overzicht;

public class Main {

    public static void main(String[] args) {
        KinderBoek kinderboek = new KinderBoek("Dolfje", "Carry Surfplank", 123, 1921, "Strip");
        KinderBoek kinderboek2 = new KinderBoek("Hoe overleef ik mezelf", "Annet schaap", 98765, 2008, "Prent");
        ThrillerBoek thriller = new ThrillerBoek ("Griezelbus", "Quincy", 756475, 2011, 13);
        Overzicht lijst = new Overzicht();


        lijst.getKinderboekenlijst().add(kinderboek);
//        lijst.getBoekenLijst().add(kinderboek);
       // lijst.getBoekenLijst().add(kinderboek2);
        lijst.getKinderboekenlijst().add(kinderboek2);
        lijst.getThrillerLijst().add(thriller);
        //lijst.getBoekenLijst().add(thriller);


        for (int i = 0; i < lijst.getBoekenLijst().size(); i++) {
            System.out.println("Id: " + (i));
            System.out.println("Titel: " + lijst.getBoekenLijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getBoekenLijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getBoekenLijst().get(i).getISBNNummer());
            System.out.println("Publicatie Jaar: " + lijst.getBoekenLijst().get(i).getPublicatieJaar());
            System.out.println("");
        }

        for (int i = 0; i < lijst.getKinderboekenlijst().size(); i++) {
            System.out.println("Id: " + (i));
            System.out.println("Titel: " + lijst.getKinderboekenlijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getKinderboekenlijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getKinderboekenlijst().get(i).getISBNNummer());
            System.out.println("Publicatie Jaar: " + lijst.getKinderboekenlijst().get(i).getPublicatieJaar());
            System.out.println("Categorie: " + lijst.getKinderboekenlijst().get(i).getCategorie()) ;
            System.out.println("");
        }

        for (int i = 0; i < lijst.getThrillerLijst().size(); i++) {
            System.out.println("Id: " + (i));
            System.out.println("Titel: " + lijst.getThrillerLijst().get(i).getTitel());
            System.out.println("Auteur: " + lijst.getThrillerLijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + lijst.getThrillerLijst().get(i).getISBNNummer());
            System.out.println("Publicatie Jaar: " + lijst.getThrillerLijst().get(i).getPublicatieJaar());
            System.out.println("Leeftijdsgrens: " + lijst.getThrillerLijst().get(i).getLeeftijdsGrens()) ;
            System.out.println("");
        }



    }
}
