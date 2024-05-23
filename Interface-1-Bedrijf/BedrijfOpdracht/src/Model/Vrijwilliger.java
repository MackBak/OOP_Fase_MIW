package Model;

public class Vrijwilliger extends Persoon implements Oproepbaar {

    private int urenGewerkt;

    public Vrijwilliger(String naam, String woonplaats, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
    }

    @Override
    public void huurIn(int Uren) {
        this.urenGewerkt += Uren;
    }

    public double berekenJaarInkomen() {
        return 0;
    }

    public String toString() {
        return super.toString() + " en is een vrijwilliger.";
    }







}
