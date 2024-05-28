// Mack Bakkum - 500721202

package model;

import java.util.ArrayList;

public class Verzekeringskantoor extends Polis {

    private String naam;
    private String plaats;
    private ArrayList<Polis> polissen = new ArrayList<>();

    public Verzekeringskantoor(String naam, String plaats) {
        this.naam = naam;
        this.plaats = plaats;
    }

    public void voegPolisToe(Polis polis) {
        polissen.add(polis);
    }

    @Override
    public String toString() {
        StringBuilder verzekeringSb = new StringBuilder();
        verzekeringSb.append(String.format("Polissen op Verzekeringskantoor: %s te %s\n", getNaam(), getPlaats()));
        for (Polis polis : polissen) {
            verzekeringSb.append(polis.toString()).append("\n");
        }
        return verzekeringSb.toString();
    }

    @Override
    public double berekenJaarPremie() {
        return 0;
    }

    public String getNaam() {
        return naam;
    }

    public String getPlaats() {
        return plaats;
    }
}
