package User;

import Book.Boek;

public class Weergave {

    public void oproep (Boek boek){
        boek.printweergave();
    }
    public void oproepGebruiker(Gebruiker gebruiker){
        gebruiker.printLijst();
    }
}

// Deze class roept de printweergave methode op die in elke subclass van Boek voorkomt.
// Hierdoor kan er in elke versie van printweergave iets anders worden opgeschreven.
// Wanneer er een object wordt aangemaakt, dan