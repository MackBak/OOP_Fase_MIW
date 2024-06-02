// Mack Bakkum - 500721202

package model;

import java.util.ArrayList;
import java.util.Collections;

public class Verzekeringskantoor {

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
        Collections.sort(polissen);
        StringBuilder verzekeringSb = new StringBuilder();
        verzekeringSb.append(String.format("Polissen op Verzekeringskantoor: %s te %s\n", getNaam(), getPlaats()));
        for (Polis polis : polissen) {
            verzekeringSb.append(polis.toString()).append("\n");
        }
        return verzekeringSb.toString();
    }

    public String getNaam() {
        return naam;
    }

    public String getPlaats() {
        return plaats;
    }
}
