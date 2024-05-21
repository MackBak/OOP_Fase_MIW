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

        assistent.huurIn(160);

        System.out.println("Het aantal personen in het bedrijf is: " + Persoon.aantalPersonen);
        System.out.println(baas.toString());
        System.out.println(medewerker.toString());
        System.out.println(assistent.toString());

        System.out.println("-------");
        System.out.println(baas.berekenJaarInkomen());
        System.out.println(medewerker.berekenJaarInkomen());
        System.out.println(assistent.berekenJaarInkomen());

    }
}
