//Mack Bakkum - 500721202

package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Verhuur extends Klant {

    private Klant klant;
    private ArrayList<Boot> boten = new ArrayList<>();
    private LocalDate startDatum;
    private int aantalDagen;

    public Verhuur(Klant klant, LocalDate datum, int aantalDagen) {
        this.klant = klant;
        this.startDatum = datum;
        this.aantalDagen = aantalDagen;
    }

    public Boot voegBootToe(Boot boot) {
        if (magVerhuurd(boot) == true) {
            boten.add(boot);
        } else {
            super.toString();
            System.out.println("Mag niet verhuurd worden! Toevoegen mislukt.");
        }
        return boot; //need to test what happens here.
    }

    @Override
    public String toString() {
        Collections.sort(boten);
        StringBuilder resultSb = new StringBuilder();
        resultSb.append(String.format("De verhuur aan %s", klant));

        if (getBoten().isEmpty()) {
            return "De verhuur aan " + super.toString() + " is mislukt, geen boten toegevoegd.";

        } else {
            resultSb.append(String.format(" van %s tot %s kost %.2f euro:\n", startDatum, startDatum.plusDays(aantalDagen - 1), berekenHuurBedrag()));
            for (Boot boot : getBoten()) {
                    resultSb.append(boot + "\n");
            }
        }
        return resultSb.toString();
    }


    public double berekenHuurBedrag() {
        double totaalPrijs = 0.0;
        for (Boot boot : boten) {
            totaalPrijs += boot.berekenHuurprijs();
        }
        return aantalDagen * totaalPrijs;
    }

    private boolean magVerhuurd(Boot boot) {
        if (klant.isVaarVaardig() == true) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Boot> getBoten() {
        return boten;
    }
}
