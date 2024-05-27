// Mack Bakkum - 500721202

package model;

public class Klant {

    private String naam;
    private String emailadres;
    private boolean vaarVaardig;

    public Klant() {
        this("onbekend");
    }

    public Klant (String naam) {
        this(naam, "onbekend", false);
    }

    public Klant (String naam, String emailadres, boolean vaarVaardig) {
        this.naam = naam;
        this.emailadres = emailadres;
        this.vaarVaardig = vaarVaardig;
    }

    public String toString() {
        return "Klant " + getNaam();
    }

    public boolean isVaarVaardig() {
        return vaarVaardig;
    }

    public String getNaam() {
        return naam;
    }

}
