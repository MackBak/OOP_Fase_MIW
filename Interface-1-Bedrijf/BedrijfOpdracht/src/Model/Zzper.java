package Model;

public class Zzper extends Persoon implements Oproepbaar{

    private double uurTarief;
    private int urenGewerkt = 0;

    public Zzper(String naam, String woonplaats, Afdeling afdeling, Double uurTarief) {
        super(naam, woonplaats, afdeling);
        this.uurTarief = uurTarief;
    }


    @Override
    public void huurIn(int Uren) {
        this.urenGewerkt += Uren;
    }

    @Override
    public double berekenJaarInkomen() {
        return getUrenGewerkt() * getUurTarief();
    }

    @Override
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
