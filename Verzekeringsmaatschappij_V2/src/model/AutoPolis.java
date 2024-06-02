// Mack Bakkum - 500721202

package model;

import java.time.LocalDate;

public class AutoPolis extends Polis {

    private Auto auto;
    private int aantalSchadevrijeJaren;

    private static int MIN_SCHADEVRIJEJAREN = 0;
    private static int MAX_SCHADEVRIJEJAREN = 40;

    private final double CAT1_PERCENTAGE = 1;
    private final double CAT2_PERCENTAGE = 0.09;
    private final double CAT3_PERCENTAGE = 0.08;
    private final double PREMIE_KORTING_JAAR = 0.05;
    private final int KORTING_JAREN_MAX = 14;


    public AutoPolis(String naamPolisHouder, int verzekerdBedrag, LocalDate startDatum, int eigenRisico, Auto auto, int aantalSchadevrijeJaren) {
        super(naamPolisHouder, verzekerdBedrag, startDatum, eigenRisico);
        this.auto = auto;
        this.aantalSchadevrijeJaren = aantalSchadevrijeJaren;

        if (aantalSchadevrijeJaren < MIN_SCHADEVRIJEJAREN) {
            System.out.println("Het aantal schadevrije jaren moet minimaal zijn!");
            this.aantalSchadevrijeJaren = MIN_SCHADEVRIJEJAREN;
        }
        if (aantalSchadevrijeJaren < MAX_SCHADEVRIJEJAREN) {
            System.out.println("Het aantal schadevrije jaren mag maximaal 40 zijn!");
            this.aantalSchadevrijeJaren = MIN_SCHADEVRIJEJAREN;
        }
    }

    @Override
    public double berekenJaarPremie() {
        double basisPremie = getVerzekerdBedrag();
        if (getEigenRisicoCategorie() == EIGEN_RISICO_BASIS) {
            basisPremie = (basisPremie * CAT1_PERCENTAGE);
        }
        if (getEigenRisicoCategorie() == EIGEN_RISICO_MID) {
            basisPremie = (basisPremie * CAT2_PERCENTAGE);
        }
        if (getEigenRisicoCategorie() == EIGEN_RISICO_MAX) {
            basisPremie = (basisPremie * CAT3_PERCENTAGE);
        }

        //Berekening voor de korting op basis van de schadevrije jaren.
        if (getAantalSchadevrijeJaren() > MIN_SCHADEVRIJEJAREN || getAantalSchadevrijeJaren() <= KORTING_JAREN_MAX) {
            basisPremie = basisPremie - (basisPremie * (getAantalSchadevrijeJaren() * PREMIE_KORTING_JAAR));
        }
        if (getAantalSchadevrijeJaren() > KORTING_JAREN_MAX) {
            basisPremie = basisPremie - (KORTING_JAREN_MAX * PREMIE_KORTING_JAAR);
        }
        return basisPremie;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t Auto: %s\n\t Aantal schadevrije jaren: %d\n\t Jaarpremie: %.2f euro", super.toString(), getAuto().getKenteken(), aantalSchadevrijeJaren, berekenJaarPremie());
    }

    public Auto getAuto() {
        return auto;
    }

    public int getAantalSchadevrijeJaren() {
        return aantalSchadevrijeJaren;
    }
}
