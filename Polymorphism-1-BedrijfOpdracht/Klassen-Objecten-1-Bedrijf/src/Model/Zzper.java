package Model;

public class Zzper extends Persoon {

    private double uurTarief;
    private int urenGewerkt = 0;

    public Zzper(String naam, String woonplaats, Afdeling afdeling, Double uurTarief) {
        super(naam, woonplaats, afdeling);
        this.uurTarief = uurTarief;
    }

    public int huurIn(int Uren) {
        return this.urenGewerkt += Uren;
    }

    public double berekenJaarInkomen() {
        return getUrenGewerkt() * getUurTarief();
    }

    public String toString() {
        return super.toString() + " en is een zzp-er met een uurtarief van " + getUurTarief();
    }

    public double getUurTarief() {
        return uurTarief;
    }

    public void setUurTarief(double uurTarief) {
        this.uurTarief = uurTarief;
    }

    public int getUrenGewerkt() {
        return urenGewerkt;
    }

    public void setUrenGewerkt(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }
}
