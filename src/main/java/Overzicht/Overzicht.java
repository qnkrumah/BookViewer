package Overzicht;

import Book.KinderBoek;
import Book.ThrillerBoek;
import Book.WoordenBoek;
import java.util.ArrayList;
import java.util.Scanner;

public class Overzicht  {
    private static ArrayList<Book.Boek> boekenLijst = new ArrayList<>();
    private static ArrayList<Book.ThrillerBoek> ThrillerLijst = new ArrayList<>();
    private static ArrayList<Book.KinderBoek> Kinderboekenlijst = new ArrayList<>();
    private static ArrayList<Book.WoordenBoek> Woordenboeklijst = new ArrayList<>();

    public Overzicht() {
    }

    public ArrayList<KinderBoek> getKinderboekenlijst() {
        return Kinderboekenlijst;
    }

    public ArrayList<ThrillerBoek> getThrillerLijst() {
        return ThrillerLijst;
    }

    public ArrayList<WoordenBoek> getWoordenboeklijst() {
        return Woordenboeklijst;
    }

    @Override
    public String toString() {
        return "Overzicht{" +
                "boekenLijst=" + boekenLijst +
                '}';
    }


    public void printkinderboekenLijst() {
        for (int i = 0; i < getKinderboekenlijst().size(); i++) {
            System.out.println("Kinderboek Overzicht: ");
            System.out.println("Boek: " + "(" + (i + 1) + ")");
            System.out.println("");
            System.out.println("Titel: " + getKinderboekenlijst().get(i).getTitel());
            System.out.println("Auteur: " + getKinderboekenlijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + getKinderboekenlijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + getKinderboekenlijst().get(i).getPublicatieJaar());
            System.out.println("Categorie: " + getKinderboekenlijst().get(i).getCategorie());
            System.out.println("");
        }
    }

    public void printthrillerLijst() {
        for (int i = 0; i < getThrillerLijst().size(); i++) {
            System.out.println("Thriller Overzicht: ");
            System.out.println("Boek: " + "(" + (i + 1) + ")");
            System.out.println("");
            System.out.println("Titel: " + getThrillerLijst().get(i).getTitel());
            System.out.println("Auteur: " + getThrillerLijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + getThrillerLijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + getThrillerLijst().get(i).getPublicatieJaar());
            System.out.println("Leeftijdsgrens: " + getThrillerLijst().get(i).getLeeftijdsGrens());
            System.out.println("");
        }
    }

    public void printwoordenboeklijst() {
        for (int i = 0; i < getWoordenboeklijst().size(); i++) {
            System.out.println("Woordenboek Overzicht: ");
            System.out.println("Boek: " + "(" + (i + 1) + ")");
            System.out.println("");
            System.out.println("Titel: " + getWoordenboeklijst().get(i).getTitel());
            System.out.println("Auteur: " + getWoordenboeklijst().get(i).getAuteur());
            System.out.println("ISBN Nummer: " + getWoordenboeklijst().get(i).getISBN());
            System.out.println("Publicatie Jaar: " + getWoordenboeklijst().get(i).getPublicatieJaar());
            System.out.println("Taal: " + getWoordenboeklijst().get(i).getTaal());
            System.out.println("Editie: " + getWoordenboeklijst().get(i).getEditie());
        }
    }

    public static void lijstMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Kinderboeken:");
        System.out.println("2) Thriller:");
        System.out.println("3) Woordenboeken:");
        int selectie = scanner.nextInt();
        lijstSelectie(selectie);
    }

    public static void lijstSelectie(int selectie){
        Overzicht overzicht = new Overzicht();
        switch (selectie){
            case 1:
                overzicht.printkinderboekenLijst();
                break;
            case 2:
                overzicht.printthrillerLijst();
                break;
            case 3:
                overzicht.printwoordenboeklijst();
                break;
        }

    }

}