package Overzicht;

import Book.Boek;
import Book.KinderBoek;
import Book.ThrillerBoek;
import Book.WoordenBoek;

import java.util.ArrayList;

public  class Overzicht  {
    private ArrayList<Book.Boek> boekenLijst = new ArrayList<>();
    private ArrayList<Book.ThrillerBoek> ThrillerLijst = new ArrayList<>();
    private ArrayList<Book.KinderBoek> Kinderboekenlijst = new ArrayList<>();
    private ArrayList<Book.WoordenBoek> Woordenboeklijst = new ArrayList<>();


    public Overzicht() {
    }

    public ArrayList<Book.Boek> getBoekenLijst() {
        return boekenLijst;
    }

    public void setBoekenLijst(ArrayList<Book.Boek> boekenLijst) {
        this.boekenLijst = boekenLijst;
    }

    public ArrayList<KinderBoek> getKinderboekenlijst() {
        return Kinderboekenlijst;
    }

    public void setKinderboekenlijst(ArrayList<KinderBoek> Kinderboekenlijst) {
        this.Kinderboekenlijst = Kinderboekenlijst;
    }

    public ArrayList<ThrillerBoek> getThrillerLijst() {
        return ThrillerLijst;
    }

    public void setThrillerLijst(ArrayList<ThrillerBoek> thrillerLijst) {
        ThrillerLijst = thrillerLijst;
    }

    public void setWoordenboeklijst(ArrayList<WoordenBoek> woordenboeklijst) {
        Woordenboeklijst = woordenboeklijst;
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

}

