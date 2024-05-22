package controller;

import Model.Afdeling;
import Model.Persoon;
import Model.Werknemer;
import Model.Zzper;

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

        int aantalPersonen = 4;
        Persoon[] personen = new Persoon[aantalPersonen];
        personen[0] = baas;
        personen[1] = medewerker;
        personen[2] = assistent;
        personen[3] = projectleider;

        for (int i = 0; i < aantalPersonen; i++) {
            toonJaarInkomen(personen[i]);
        }
    }//end of main

    public static void toonJaarInkomen(Persoon persoon) {
        System.out.println(persoon.getNaam() + " verdient " + persoon.berekenJaarInkomen() + " per jaar.");
    }
}
