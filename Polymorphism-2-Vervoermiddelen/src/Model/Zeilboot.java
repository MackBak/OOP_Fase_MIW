package Model;

public class Zeilboot extends Vaartuig {

    public Zeilboot(String merk, String type, double lengte) {
        super(merk, type, lengte);
    }

    @Override
    public String geefAandrijfKracht() {
        return "windrkacht.";
    }

}
