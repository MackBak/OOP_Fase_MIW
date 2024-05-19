package Model;


public class Score {
    private Vak vak;
    private double cijfer;
    private int behaaldePunten;

    public Score (Vak vak, double Cijfer) {
        this.vak = vak;
        this.cijfer = Cijfer;

        if (cijfer >= vak.getCesuur()) {
            behaaldePunten = vak.getPunten();
        } else {
            behaaldePunten = 0;
        }
    }

    public Vak getVak() {
        return vak;
    }

    public double getCijfer() {
        return cijfer;
    }

    public int getBehaaldePunten() {
        return behaaldePunten;
    }
}
