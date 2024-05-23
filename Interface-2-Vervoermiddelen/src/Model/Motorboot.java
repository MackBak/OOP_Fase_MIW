package Model;

public class Motorboot extends Vaartuig implements Belastbaar {

    private String soortBrandstof;
    static double MIN_BELASTING = 60;
    static double MAX_BELASTING = 100;
    static double DIESEL_BELASTING = 1.5;
    static int LENGTE_GRENS = 12;

    public Motorboot(String merk, String type, double Lengte, String brandstof) {
        super(merk, type, Lengte);
        this.soortBrandstof = brandstof;
    }

    @Override
    public String geefAandrijfKracht() {
        return this.soortBrandstof + "  ";
    }

    @Override
    public double getVervoerBelasting() {
        double belastingMotorBoot = MIN_BELASTING;
        if (getLengteInMeter() >= LENGTE_GRENS) {
            belastingMotorBoot = MAX_BELASTING;
        }
        if (soortBrandstof == "Diesel") {
            belastingMotorBoot = belastingMotorBoot * DIESEL_BELASTING;
        }
        return belastingMotorBoot;
    }
}