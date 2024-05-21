package Model;

public class SnelheidsBoete extends VerkeersBoete {
    private int gemetenSnelheid;
    private int maximumSnelheid;


    public SnelheidsBoete(String naamDader, String kentekenAuto, int gemetenSnelheid, int maximumSnelheid) {
        super(naamDader, kentekenAuto);
        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        bepaalBedrag();
    }

    public void bepaalBedrag() {
        int snelheidTeVeel = gemetenSnelheid - maximumSnelheid;
        double boete = 0;

        if (snelheidTeVeel <= 10) {
            boete = snelheidTeVeel * 10;
        }
        if (snelheidTeVeel <= 30) {
            boete = snelheidTeVeel * 15;
        } else {
            boete = snelheidTeVeel * 20;
        }
        if (boete > 1000) {
            boete = 1000;
        }
        setBedrag(boete);
    }


    public int getGemetenSnelheid() {
        return gemetenSnelheid;
    }

    public void setGemetenSnelheid(int gemetenSnelheid) {
        this.gemetenSnelheid = gemetenSnelheid;
    }

    public int getMaximumSnelheid() {
        return maximumSnelheid;
    }

    public void setMaximumSnelheid(int maximumSnelheid) {
        this.maximumSnelheid = maximumSnelheid;
    }

    @Override
    public String toString() {
        return "Snelheidsboete voor " + super.getNaamDader() + ", " + super.getKentekenAuto() + ", " + super.getBedrag() + " waar  " + getMaximumSnelheid() + " km/u is toegestaan.";

    }
}
