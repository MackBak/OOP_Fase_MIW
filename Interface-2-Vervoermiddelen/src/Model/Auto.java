package Model;

public class Auto extends Voertuig implements Belastbaar {
    private String soortBrandstof;
    protected static int AANTAL_WIELEN = 4;
    static int ONDERGRENS_GEWICHT = 1000;
    static int BOVENGRENS_GEWICHT = 1450;
    static int MIN_BELASTING = 85;
    static int MID_BELASTING = 104;
    static int MAX_BELASTING = 122;
    static double ELEKTRISCHE_BELASTING = 0.5;
    static double DIESEL_BELASTING = 1.3;

    public Auto(String merk, String type, int gewicht, String brandstof) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.soortBrandstof = brandstof;
    }

    @Override
    public String geefAandrijfKracht() {
        return this.soortBrandstof + " motor ";
    }

    public String getSoortBrandstof() {
        return soortBrandstof;
    }

    public void setSoortBrandstof(String soortBrandstof) {
        this.soortBrandstof = soortBrandstof;
    }

    @Override
    public double getVervoerBelasting() {
        double belastingPerKwartaal = 0;
        if (getGewicht() < ONDERGRENS_GEWICHT) {
            belastingPerKwartaal = MIN_BELASTING;
        }
        if (getGewicht() <= BOVENGRENS_GEWICHT && (getGewicht() >= ONDERGRENS_GEWICHT)) {
            belastingPerKwartaal = MID_BELASTING;
        }
        if (getGewicht() > BOVENGRENS_GEWICHT) {
                belastingPerKwartaal = MAX_BELASTING;
            }
        if (soortBrandstof == "Diesel") {
            belastingPerKwartaal = belastingPerKwartaal * DIESEL_BELASTING;
        } if (soortBrandstof == "Elektrisch") {
            belastingPerKwartaal = belastingPerKwartaal * ELEKTRISCHE_BELASTING;
        }

        return belastingPerKwartaal;
    }
}
