package Overzicht;

import Book.Boek;
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
    Weergave weergave = new Weergave();

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
        Boek kinderBoek = new KinderBoek("","", 0,0,"");
        weergave.oproep(kinderBoek);
    }

    public void printthrillerLijst() {
        Boek thrillerBoek = new ThrillerBoek("","", 0,0,0);
        weergave.oproep(thrillerBoek);
    }

    public void printwoordenboeklijst() {
        Boek woordenBoek = new WoordenBoek("","", 0,0,"",0);
        weergave.oproep(woordenBoek);
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