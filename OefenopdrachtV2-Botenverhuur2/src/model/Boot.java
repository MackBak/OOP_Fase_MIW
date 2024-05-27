// Mack Bakkum - 500721202

package model;

public abstract class Boot implements Comparable<Boot>, VrijVerhuurbaar {

    private static int lastId;
    private int id;
    private String naam;
    private int lengte;

    private static int STANDAARD_LENGE = 5;
    private static int MIN_LENGTE = 0;

    protected Boot(String naam, int lengte) {
        this.naam = naam;
        this.lengte = lengte;
        this.id = ++lastId;

        if (lengte < MIN_LENGTE) {
            System.out.println("Lengte moet positief zijn! Boot is nu 5m");
            this.lengte = STANDAARD_LENGE;
        }
    }

    public String toString() {
        return String.format("Boot %d met de naam%s\n\t",getId(), getNaam());
    }

    public int CompareTo(Boot boot2) {
        return this.naam.compareTo(boot2.naam);
    }

    public abstract double berekenHuurprijs();

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public int getLengte() {
        return lengte;
    }
}

//to do:
//Foutmelding bij lengte boot <0. Dan boot = 5 meter standaard.