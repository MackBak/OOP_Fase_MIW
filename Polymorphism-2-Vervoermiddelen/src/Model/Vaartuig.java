package Model;

public abstract class Vaartuig extends Vervoermiddel {

    private double lengteInMeter;

    protected Vaartuig(String merk, String type, double lengte) {
        super(merk, type);
        this.lengteInMeter = lengte;
    }

    public double getLengteInMeter() {
        return lengteInMeter;
    }

    public void setLengteInMeter(double lengteInMeter) {
        this.lengteInMeter = lengteInMeter;
    }
}
