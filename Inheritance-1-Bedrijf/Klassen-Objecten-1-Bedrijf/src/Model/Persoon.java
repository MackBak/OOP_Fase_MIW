package Model;

public class Persoon {
    public static int aantalPersonen;
    protected static String DEFAULTWAARDE_NAAM = "Onbekend";
    protected static String DEFAULTWAARDE_WOONPLAATS = "Onbekend";
    protected int personeelsNummer;
    protected String naam;
    protected String woonplaats;
    protected Afdeling afdeling;

    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.afdeling = afdeling;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, DEFAULTWAARDE_WOONPLAATS, new Afdeling()); //Dit roep nu the methode hier boven op en passeert de standaard values.
    }

    public Persoon() {
        this(DEFAULTWAARDE_NAAM); //Dit noemt nu de methode hierboven op (Public Persoon(String Naam)

    }

    public double berekenjaarInkomen() {
        return 0;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    public String toString() {
        return this.naam + " woont in " + this.woonplaats + " en werkt op " + this.afdeling.toString();
    }
}
