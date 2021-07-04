package Overzicht;

import User.GastAccount;
import User.GebruikerAccount;
import java.util.ArrayList;
import java.util.Scanner;

public class GebruikersOverzicht {

    private static ArrayList<User.GastAccount> gastaccountLijst = new ArrayList<>();
    private static ArrayList<User.GebruikerAccount> gebruikersAccountlijst = new ArrayList<>();
    Weergave weergave = new Weergave();

    public GebruikersOverzicht() {
    }

    public ArrayList<GastAccount> getGastaccountLijst() {
        return gastaccountLijst;
    }

    public ArrayList<GebruikerAccount> getGebruikersAccountlijst() {
        return gebruikersAccountlijst;
    }

    @Override
    public String toString() {
        return "Overzicht{" +
                "boekenLijst=" + gebruikersAccountlijst +
                '}';
    }

    public void gebruikerAccountLijst() {
        GebruikerAccount gebruikerAccount = new GebruikerAccount("",0,"","");
        weergave.oproepGebruiker(gebruikerAccount);
    }

    public void gastAcocuntLijst() {
        GastAccount gastAccount = new GastAccount("",0,true);
        weergave.oproepGebruiker(gastAccount);
    }

    public static void lijstMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Lijst met alle gebruikersaccounts in Bookviewer:");
        System.out.println("2) Lijst met alle gastaccounts in Bookviewer:");
        int selectie = scanner.nextInt();
        lijstSelectie(selectie);
    }

    public static void lijstSelectie(int selectie) {
        GebruikersOverzicht overzicht = new GebruikersOverzicht();
        switch (selectie) {
            case 1 -> overzicht.gebruikerAccountLijst();
            case 2 -> overzicht.gastAcocuntLijst();
        }
    }
}