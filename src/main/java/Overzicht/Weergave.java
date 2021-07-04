package Overzicht;

import Book.Boek;
import User.Gebruiker;

public class Weergave {

    public void oproep (Boek boek){
        boek.printweergave();
    }
    public void oproepGebruiker(Gebruiker gebruiker){
        gebruiker.printLijst();
    }
}
