//Mack Bakkum - 500721202

package model;

public class Klant {

    private String naam;
    private String emailadres;
    private boolean vaarVaardig;

    public Klant(String naam, String emailadres, boolean vaardig) {
        this.naam = naam;
        this.emailadres = emailadres;
        this.vaarVaardig = vaardig;
    }

    public Klant (String naam) {
        this(naam, "onbekend", false);
    }

    public Klant() {
        this("onbekend");
    }

    public String toString() {
        return "Klant " + naam;
    }

    public boolean isVaarVaardig() {
        return vaarVaardig;
    }

}
