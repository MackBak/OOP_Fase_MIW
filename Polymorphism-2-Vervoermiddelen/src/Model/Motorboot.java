package Model;

public class Motorboot extends Vaartuig{

    private String soortBrandstof;

    public Motorboot(String merk, String type, double Lengte, String brandstof) {
        super(merk, type, Lengte);
        this.soortBrandstof = brandstof;
    }

    @Override
    public String geefAandrijfKracht() {
        return this.soortBrandstof + " motor";
    }

}
