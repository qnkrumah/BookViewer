package Overzicht;

import Book.Boek;

import java.util.ArrayList;

public class Overzicht {
    private ArrayList<Book.Boek> boekenLijst = new ArrayList<>();

    public Overzicht() {
    }

    public ArrayList<Book.Boek> getBoekenLijst() {
        return boekenLijst;
    }

    public void setBoekenLijst(ArrayList<Book.Boek> boekenLijst) {
        this.boekenLijst = boekenLijst;
    }

    @Override
    public String toString() {
        return "Overzicht{" +
                "boekenLijst=" + boekenLijst +
                '}';
    }

}
