package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Verhuur extends Klant {

    private Klant klant;
    private ArrayList<Boot> boten = new ArrayList<>();
    private LocalDate startDatum;
    private int aantalDagen;

    public Verhuur(Klant klant, LocalDate startDatum, int aantalDagen) {
        this.klant = klant;
        this.startDatum = startDatum;
        this.aantalDagen = aantalDagen;
    }

    @Override
    public String toString() {
        if (this.boten.size() < 1) {
            return String.format("De verhuur aan %s op %s is mislukt, geen boten toegevoegd", klant, startDatum);
        } else {
            StringBuilder huurSb = new StringBuilder();
            String huurBedragString = String.format("%.2f", berekenHuurBedrag());
            String string2 = String.format("De verhuur aan %s van %s tot %s kost %s euro\n", getKlant(), getStartDatum(), getStartDatum().plusDays(aantalDagen - 1), huurBedragString);
            huurSb.append(string2);
            for (Boot boot : getBoten()) {
                huurSb.append(boot.toString() + "\n");
            }
            return huurSb.toString();
        }
    }

    public void voegBootToe(Boot boot) {
        if (magVerhuurd(boot) == true) {
            boten.add(boot);
        } else {
            super.toString();
            System.out.println("Mag niet verhuurd worden! Toevoegen mislukt.");
        }
    }


    public double berekenHuurBedrag() {
        double totaleHuur = 0.0;
        for (Boot boot : boten) {
            totaleHuur += boot.berekenHuurprijs();
        }
        return aantalDagen * totaleHuur;
    }


    private boolean magVerhuurd(Boot boot) {
        if (klant.isVaarVaardig() == true) {
            return true;
        } else {
            return false;
        }
    }


    public Klant getKlant() {
        return klant;
    }

    public ArrayList<Boot> getBoten() {
        return boten;
    }

    public LocalDate getStartDatum() {
        return startDatum;
    }
}
