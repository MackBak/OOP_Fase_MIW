// Mack Bakkum - 500721202

package model;

import java.time.LocalDate;

public abstract class Polis implements Comparable<Polis> {

    protected String naamPolishouder;
    protected int verzekerdBedrag;
    protected LocalDate startDatum;
    protected int eigenRisicoCategorie;

    protected static int EIGEN_RISICO_BASIS = 1;
    protected static int EIGEN_RISICO_MID = 2;
    protected static int EIGEN_RISICO_MAX = 3;

    public Polis(String naamPolishouder, int verzekerdBedrag, LocalDate startDatum, int eigenRisicoCategorie) {
        this.naamPolishouder = naamPolishouder;
        this.verzekerdBedrag = verzekerdBedrag;
        this.startDatum = startDatum;
        this.eigenRisicoCategorie = eigenRisicoCategorie;

        if (this.eigenRisicoCategorie > 3 || this.eigenRisicoCategorie < 1) {
            this.eigenRisicoCategorie = EIGEN_RISICO_BASIS;
            System.out.println("Eigen risico moet 1, 2 of 3 zijn! Wordt nu standaard gezet op 1.");
        }
    }

    public Polis(String naamPolishouder, int verzekerdBedrag) {
        this(naamPolishouder, verzekerdBedrag, LocalDate.now(), EIGEN_RISICO_BASIS);
    }

    protected Polis() {
    }

    public abstract double berekenJaarPremie();

    @Override
    public int compareTo(Polis anderePolis) {
        return this.startDatum.compareTo(anderePolis.startDatum);
    }

    public String toString() {
        return String.format("Polis op naam van %s\n\t Verzekerd Bedrag: %d euro\n\t Startdatum: %s\n\t Eigen risico categorie: %d", getNaamPolishouder(), getVerzekerdBedrag(), getStartDatum(), getEigenRisicoCategorie());
    }

    public String getNaamPolishouder() {
        return naamPolishouder;
    }

    public int getVerzekerdBedrag() {
        return verzekerdBedrag;
    }

    public LocalDate getStartDatum() {
        return startDatum;
    }

    public int getEigenRisicoCategorie() {
        return eigenRisicoCategorie;
    }
}
