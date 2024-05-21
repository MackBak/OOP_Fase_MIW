package Model;

public class VerkeersBoete {
    private String naamDader = "Onbekend";
    private String kentekenAuto = "Onbekend";
    private double Bedrag = 0;

    public VerkeersBoete() {

    }

    public VerkeersBoete(String naamDader, String kentekenAuto) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;

    }

    private VerkeersBoete(String naamDader, String kentekenAuto, double Bedrag) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.Bedrag = Bedrag;
    }

    public String getNaamDader() {
        return naamDader;
    }

    public void setNaamDader(String naamDader) {
        this.naamDader = naamDader;
    }

    public String getKentekenAuto() {
        return kentekenAuto;
    }

    public void setKentekenAuto(String kentekenAuto) {
        this.kentekenAuto = kentekenAuto;
    }

    public double getBedrag() {
        return Bedrag;
    }

    public void setBedrag(double bedrag) {
        Bedrag = bedrag;
    }

    public String toString() {
        return "Verkeersboete voor " + getNaamDader() + ", kenteken " + getKentekenAuto() + ", " + getBedrag() + "euro.";
    }
}
