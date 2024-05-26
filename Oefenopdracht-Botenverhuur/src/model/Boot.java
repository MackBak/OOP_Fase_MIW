//Mack Bakkum - 500721202

package model;

public abstract class Boot implements Comparable<Boot>, VrijVerhuurbaar{
    private static int lastId;
    private int id;
    private String naam;
    private int lengte;

    private static int STANDAARD_LENGTE = 5;
    private static int MIN_LENGTE = 0;

    protected Boot (String naam, int lengte) {
        this.naam = naam;
        this.lengte = lengte;
        this.id = ++lastId;

        if (lengte < MIN_LENGTE) {
            System.out.println("Lengte moet positief zijn! De boot krijgt nu een standaard lengte van 5m.");
            this.lengte = STANDAARD_LENGTE;
        }
    }

    public String toString() {
        String vaarPlichtig;
        if (isVaarbewijsPlichtig()) {
            vaarPlichtig = "Ja";
        } else {
            vaarPlichtig = "Nee";
        }

        return String.format("Boot %d met naam %s\n\tVaarbewijs vereist: %s", id, naam, vaarPlichtig);
    }

    @Override
    public int compareTo(Boot andereBoot) {
        return this.naam.compareTo(andereBoot.naam);
    }

    public double berekenHuurprijs() {
        return 0.0;
    }


    public int getLengte() {
        return lengte;
    }
}
