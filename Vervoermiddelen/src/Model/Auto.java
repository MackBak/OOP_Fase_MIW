package Model;

public class Auto extends Voertuig {
    private String soortBrandstof;
    protected static int AANTAL_WIELEN = 4;

    public Auto(String merk, String type, int gewicht, String brandstof) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.soortBrandstof = brandstof;
    }

    @Override
    public String geefAandrijfKracht() {
        return this.soortBrandstof + " motor.";
    }

    public String getSoortBrandstof() {
        return soortBrandstof;
    }

    public void setSoortBrandstof(String soortBrandstof) {
        this.soortBrandstof = soortBrandstof;
    }
}
