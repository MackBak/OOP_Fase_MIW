package Model;

public class ParkeerBoete extends VerkeersBoete {

    private int zone;

    public ParkeerBoete(String naamDader, String kentekenAuto, int Zone) {
        super(naamDader, kentekenAuto);
        this.zone = Zone;
        bepaalBedrag();
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public void bepaalBedrag() {
        double boete = 0;
        if (getZone() == 1) {
            boete = 60;
        } if (getZone() == 2) {
            boete = 100;
        } if (getZone() == 3) {
            boete = 180;
        }

        super.setBedrag(boete);
        //In zone 1 is de boete 60 euro, in zone 2 is het 100 euro, in zone 3 betaalt je 180
    }

    @Override
    public String toString() {
        return "Parkeerboete voor " + super.getNaamDader() + ", " + super.getKentekenAuto() + ", " + super.getBedrag() + " euro in zone " + getZone();
    }
}
