package model;

public class Vak extends LesEenheid {

    double cijfer;
    private static int DEFAULT_CIJFER = -1;
    private static double ONDERGRENS_VOLDOENDE = 5.5;


    public Vak(double cijfer, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.cijfer = cijfer;
    }

    public Vak(String naam, int ects, int studiejaar) {
        this(DEFAULT_CIJFER, naam, ects, studiejaar);
    }

    public boolean isAfgerond() {
        boolean isAfgerond = false;
        if (getCijfer() >= ONDERGRENS_VOLDOENDE) {
            isAfgerond = true;
        }
        return isAfgerond;
    }

    @Override
    public String toString(){
        return super.toString() + "cijfer " + cijfer;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }
}
