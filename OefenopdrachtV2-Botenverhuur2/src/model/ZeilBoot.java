package model;

public class ZeilBoot extends Boot {

    private static double KORTE_ZEILBOOT_PRIJS = 40.0;
    private static double KORTE_ZEILBOOT = 7.0;
    private static double LANGE_ZEILBOOT = 15.0;
    private static double LANGE_ZEILBOOT_PRIJS = 70.0;

    public ZeilBoot(String naam, int lengte) {
        super(naam, lengte);
    }

    @Override
    public String toString() {
        String vaarPlichtig = "";
        if (isVaarbewijsPlichtig() == true) {
            vaarPlichtig = "Ja";
        } else {
            if (isVaarbewijsPlichtig() == false) {
                vaarPlichtig = "Nee";
            }
        }
        return String.format(super.toString() + "Vaarbewijs vereist: %s\n\tHuurprijs: %.2f euro\n\t", vaarPlichtig, berekenHuurprijs());
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        if (getLengte() > LANGE_ZEILBOOT) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public double berekenHuurprijs() {
        if (getLengte() > KORTE_ZEILBOOT) {
            return LANGE_ZEILBOOT_PRIJS;
        } else {
            return KORTE_ZEILBOOT_PRIJS;
        }
    }


    @Override
    public int compareTo(Boot o) {
        return 0;
    }
}
