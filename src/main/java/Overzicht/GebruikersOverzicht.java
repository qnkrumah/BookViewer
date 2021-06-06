package Overzicht;

import User.GastAccount;
import User.Gebruiker;
import User.GebruikerAccount;

import java.util.ArrayList;

public class GebruikersOverzicht {

    private ArrayList<User.Gebruiker> gebruikersLijst = new ArrayList<>();
    private ArrayList<User.GastAccount> gastaccountLijst = new ArrayList<>();
    private ArrayList<User.GebruikerAccount> gebruikersAccountlijst = new ArrayList<>();

    public GebruikersOverzicht(){
    }


    public ArrayList<Gebruiker> getGebruikersLijst() {
        return gebruikersLijst;
    }

    public void setGebruikersLijst(ArrayList<Gebruiker> gebruikersLijst) {
        this.gebruikersLijst = gebruikersLijst;
    }

    public ArrayList<GastAccount> getGastaccountLijst() {
        return gastaccountLijst;
    }

    public void setGastaccountLijst(ArrayList<GastAccount> gastaccountLijst) {
        this.gastaccountLijst = gastaccountLijst;
    }

    public ArrayList<GebruikerAccount> getGebruikersAccountlijst() {
        return gebruikersAccountlijst;
    }

    public void setGebruikersAccountlijst(ArrayList<GebruikerAccount> gebruikersAccountlijst) {
        this.gebruikersAccountlijst = gebruikersAccountlijst;
    }

    @Override
    public String toString() {
        return "Overzicht{" +
                "boekenLijst=" + gebruikersLijst +
                '}';
    }
}
