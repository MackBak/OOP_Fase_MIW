package model;

public class ProfessionalSkills extends LesEenheid {

    boolean gehaald;

    public ProfessionalSkills(Boolean gehaald, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.gehaald = gehaald;
    }

    public ProfessionalSkills(String naam, int ects, int studiejaar) {
        this(false, naam, ects, studiejaar);
    }

    public boolean isAfgerond() {
        boolean isAfgerond = false;
        if (isGehaald() == true) {
            isAfgerond = true;
        }
        return isAfgerond;
    }

    public String toString() {
        if (gehaald == true) {
            return super.toString() + "gehaald.";
        } else {
            return super.toString() + "niet gehaald";
        }
    }

    public boolean isGehaald() {
        return gehaald;
    }

    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }
}
