package User;

import Book.Boek;

import java.util.ArrayList;

public abstract class Gebruiker {
    private String naam;
    private Integer leeftijd;
    private ArrayList<Gebruiker> gebruikersLijst = new ArrayList<>();
    private ArrayList<Gebruiker> gastaccountLijst = new ArrayList<>();
    private ArrayList<Gebruiker> gebruikersAccountlijst = new ArrayList<>();

    public Gebruiker(String naam, Integer leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(Integer leeftijd) {
        this.leeftijd = leeftijd;
    }

    public ArrayList<Gebruiker> getGebruikersLijst() {
        return gebruikersLijst;
    }

    public void setGebruikersLijst(ArrayList<Gebruiker> gebruikersLijst) {
        this.gebruikersLijst = gebruikersLijst;
    }

    public ArrayList<Gebruiker> getGastaccountLijst() {
        return gastaccountLijst;
    }

    public void setGastaccountLijst(ArrayList<Gebruiker> gastaccountLijst) {
        this.gastaccountLijst = gastaccountLijst;
    }

    public ArrayList<Gebruiker> getGebruikersAccountlijst() {
        return gebruikersAccountlijst;
    }

    public void setGebruikersAccountlijst(ArrayList<Gebruiker> gebruikersAccountlijst) {
        this.gebruikersAccountlijst = gebruikersAccountlijst;
    }
}
