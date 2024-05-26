//Mack Bakkum - 500721202

package model;

public class ZeilBoot extends Boot {

    private static double MAX_LEGALE_LENGTE = 15.0;
    private static double MIN_PRIJS_LENGTE = 7.0;
    private static double KORTE_BOOT_PRIJS = 40.0;
    private static double LANGE_BOOT_PRIJS = 70.0;

    public ZeilBoot(String naam, int lengte) {
        super(naam, lengte);
    }

    @Override
    public String toString() {
        return String.format("Zeil%s\n\tHuurprijs: %.2f euro\n", super.toString(), berekenHuurprijs());
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        if (getLengte() > MAX_LEGALE_LENGTE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double berekenHuurprijs() {
        if (getLengte() > MIN_PRIJS_LENGTE) {
            return LANGE_BOOT_PRIJS;
        } else {
            return KORTE_BOOT_PRIJS;
        }
    }


}
