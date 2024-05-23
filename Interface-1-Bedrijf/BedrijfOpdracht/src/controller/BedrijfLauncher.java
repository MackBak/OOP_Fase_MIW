package controller;

import Model.Afdeling;
import Model.Persoon;
import Model.Werknemer;
import Model.Zzper;
import Model.Vrijwilliger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BedrijfLauncher {
    public static void main(String[] args) {

        int aantalAfdelingen = 4;
        Afdeling[] afdelingen = new Afdeling[aantalAfdelingen];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");

        Werknemer baas = new Werknemer("Mark", "Den Haag", afdelingen[2], 10000.00);
        Werknemer medewerker = new Werknemer("Caroline", "Delft", afdelingen[1], 4000.00);
        Zzper assistent = new Zzper("Klaas", "Diemen", afdelingen[3], 50.0);
        Zzper projectleider = new Zzper("Ronald", "Zaandam", afdelingen[0], 80.0);

        assistent.huurIn(160);
        projectleider.huurIn(320);

        ArrayList<Persoon> personen = new ArrayList<Persoon>();
        personen.add(new Werknemer("Mark", "Den Haag", afdelingen[2], 10000.0));
        personen.add(new Werknemer("Angelique", "Rotterdam", afdelingen[2], 5000.0));
        personen.add(new Werknemer("Caroline", "Delft", afdelingen[1], 4000.0));
        personen.add(new Zzper("Klaas", "Diemen", afdelingen[3], 50.00));
        personen.add(new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00));
        personen.add(new Zzper("Jannie", "Utrecht", afdelingen[0], 60.00));
        personen.add(new Zzper("Anne", "Zwolle", afdelingen[0], 40.00));

        //import in ArrayList van hoofdstuk 7 opdracht.
        personen.add(new Vrijwilliger("Ambi", "Amsterdam", afdelingen[0]));
        personen.add(new Vrijwilliger("Naledi", "Gaborone", afdelingen[1]));
        personen.add(new Vrijwilliger("Ceren", "Istanboel", afdelingen[2]));
        personen.add(new Vrijwilliger("Haining", "Shaoxing", afdelingen[3]));

        Collections.sort(personen);


        for (int i = 0; i < personen.size(); i++) {
            if (personen.get(i) instanceof Vrijwilliger) {
                ((Vrijwilliger) personen.get(i)).huurIn(160);
            }
        }// for loop om alle vrijwilligers in te huren voor 160u.


        for (int teller = 0; teller < personen.size(); teller++) {
            if (personen.get(teller) instanceof Zzper) {
                ((Zzper) personen.get(teller)).huurIn(320);
            }
        }//for loop to gather all Zzpers in the ArrayList.

        for (int i = 0; i < personen.size(); i++) {
            toonJaarInkomen(personen.get(i));
        }

    }//end of main

    public static void toonJaarInkomen(Persoon persoon) {
        System.out.println(persoon);
        System.out.println(persoon.getNaam() + " verdient " + persoon.berekenJaarInkomen() + " per jaar.");
    }
}
