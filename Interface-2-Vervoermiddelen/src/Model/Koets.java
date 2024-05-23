package Model;

public class Koets extends Voertuig {
    private int aantalPaarden;
    protected static int AANTAL_WIELEN = 4;

    public Koets(String merk, String type, int gewicht, int aantalPaarden) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.aantalPaarden = aantalPaarden;

    }

    @Override
    public String geefAandrijfKracht() {
        return this.aantalPaarden + " paarden ";
    }

    public int getAantalPaarden() {
        return aantalPaarden;
    }

    public void setAantalPaarden(int aantalPaarden) {
        this.aantalPaarden = aantalPaarden;
    }
}
