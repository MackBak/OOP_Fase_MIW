// Mack Bakkum - 500721202

package model;

import java.time.LocalDate;

public class WA_Polis extends Polis {

    private int aantalPersonen;

    private final double CAT1_PERCENTAGE = 0.006;
    private final double CAT2_PERCENTAGE = 0.005;
    private final double CAT3_PERCENTAGE = 0.004;

    public WA_Polis(String naamPolishouder, int verzkerdBedrag, LocalDate startDatum, int eigenRisico, int aantalPersonen) {
        super(naamPolishouder, verzkerdBedrag, startDatum, eigenRisico);
        this.aantalPersonen = aantalPersonen;
    }

    public WA_Polis(String naamPolishouder, int verzekerdBedrag) {
        this(naamPolishouder, verzekerdBedrag, LocalDate.now(), EIGEN_RISICO_BASIS, 1);
    }

    @Override
    public double berekenJaarPremie() {
        double jaarPremie = getVerzekerdBedrag();
        if (getEigenRisicoCategorie() == EIGEN_RISICO_BASIS) {
            jaarPremie = aantalPersonen * (jaarPremie * CAT1_PERCENTAGE);
        }
        if (getEigenRisicoCategorie() == EIGEN_RISICO_MID) {
            jaarPremie = aantalPersonen * (jaarPremie * CAT2_PERCENTAGE);
        }
        if (getEigenRisicoCategorie() == EIGEN_RISICO_MAX) {
            jaarPremie = aantalPersonen * (jaarPremie * CAT3_PERCENTAGE);
        }
        return jaarPremie;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t Aantal Personen: %d\n\t Jaarpremie: %.2f euro", super.toString(), getAantalPersonen(), berekenJaarPremie());
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }
}
