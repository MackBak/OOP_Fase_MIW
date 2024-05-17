package Model;

public class Persoon {
    public static int aantalPersonen = 0;
    final int personeelsNummer;
    String naam;
    String woonplaats;
    Double maandSalaris;

    public Persoon(String naam, String woonplaats, Double maandSalaris) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandSalaris;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this.naam = naam;
        this.woonplaats = "Onbekend";
        this.maandSalaris = 0.0;
        this.personeelsNummer = ++aantalPersonen;

    }

    public Persoon() {
        this.personeelsNummer = ++aantalPersonen;

    }

    public double berekenjaarInkomen() {
        return this.maandSalaris * 12;

    }

}
