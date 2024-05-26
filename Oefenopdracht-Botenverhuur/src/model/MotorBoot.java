//Mack Bakkum - 500721202

package model;

public class MotorBoot extends Boot {
    private int maxSnelheid;

    private static double KORTE_BOOT_KOSTEN = 60;
    private static double LANGE_BOOT_KOSTEN = 90;
    private static double BOOT_LENGTE = 10.0;
    private static int MAX_SNELHEID = 20;
    private static int MIN_SNELHEID = 15;

    public MotorBoot(String naam, int lengte, int snelheid) {
        super(naam, lengte);
        this.maxSnelheid = snelheid;
    }

    @Override
    public String toString() {
        return String.format("Motor%s\n\tHuurprijs: %.2f euro\n", super.toString(), berekenHuurprijs());
    }

    @Override
    public boolean isVaarbewijsPlichtig() { // Gebruik van getters om snelheid en lengte te meten.
        if (getMaxSnelheid() > MAX_SNELHEID || getLengte() > MIN_SNELHEID) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double berekenHuurprijs() {
        if (getLengte() > BOOT_LENGTE) {
            return LANGE_BOOT_KOSTEN;
        } else {
            return KORTE_BOOT_KOSTEN;
        }
    }


    public int getMaxSnelheid() {
        return maxSnelheid;
    }
}
