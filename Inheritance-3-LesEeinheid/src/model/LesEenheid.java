package model;

public class LesEenheid {

    String naam;
    int ects;
    int studiejaar;

    public LesEenheid(String naam, int ects, int studiejaar) {
        this.naam = naam;
        this.ects = ects;
        this.studiejaar = studiejaar;
    }

    public String toString() {
        return this.naam + ", " + this.ects + " ects, studiejaar " + this.studiejaar + ", ";
    }



}
