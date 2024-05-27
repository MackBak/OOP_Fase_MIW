package model;

public class MotorBoot extends Boot {

    private int maxSnelheid;
    private static double MAX_BOOT_LENGTE = 15.0;
    private static double MAX_BOOT_SNELHEID = 20.0;
    private static double KLEINE_MOTORBOOT = 10.0;
    private static double KLEINE_MOTORBOOT_PRIJS = 60.0;
    private static double GROTE_MOTORBOOT_PRIJS = 90.0;

    public MotorBoot(String naam, int lengte, int snelheid) {
        super(naam, lengte);
        this.maxSnelheid = snelheid;
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
        return String.format(super.toString() + "Vaarbewijs vereist: %s\n\t Huurprijs: %.2f euro\n", vaarPlichtig, berekenHuurprijs());
    }


    @Override
    public boolean isVaarbewijsPlichtig() {
        if (getMaxSnelheid() > MAX_BOOT_SNELHEID || this.getLengte() > MAX_BOOT_LENGTE) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public double berekenHuurprijs() {
        if (this.getLengte() > KLEINE_MOTORBOOT) {
            return GROTE_MOTORBOOT_PRIJS;
        } else {
            return KLEINE_MOTORBOOT_PRIJS;
        }
    }


    public int getMaxSnelheid() {
        return maxSnelheid;
    }

    @Override
    public int compareTo(Boot o) {
        return 0;
    }
}
