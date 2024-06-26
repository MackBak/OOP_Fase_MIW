package Model;

public class Afdeling {

    private String afdelingsNaam;
    private String afdelingsPlaats;

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = afdelingsNaam;
        this.afdelingsPlaats = afdelingsPlaats;
    }

    public Afdeling() {
        this("Onbekend", "Onbekend");
    }

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }

    public void setAfdelingsNaam(String afdelingsNaam) {
        this.afdelingsNaam = afdelingsNaam;
    }

    public void setAfdelingsPlaats(String afdelingsPlaats) {
        this.afdelingsPlaats = afdelingsPlaats;
    }

    public String toString() {
        return "Afdeling " + this.afdelingsNaam + " te " + this.afdelingsPlaats;
    }
}
