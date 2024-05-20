package model;

public class Verbruik {

    private final static double BASIS_KOSTEN = 9.95;
    private final static int VERBRUIK_ABONNEMENT = 3000;
    private final static double MEERPRIJS_MB = 0.025;

    private String maand;
    private int hoeveelheidMb;
    private double kosten;

    public Verbruik(String maand, int hoeveelheidMb) {
        this.maand = maand;
        this.hoeveelheidMb = hoeveelheidMb;
    }

    public Verbruik(String maand){
        this.maand = maand;
        this.hoeveelheidMb = 0;
    }

    public Verbruik() {
        this.maand = "Onbekend";
        this.hoeveelheidMb = 0;
    }

    public void toonVerbruik() {
        String buitenOfNiet = "";
        if (this.hoeveelheidMb > VERBRUIK_ABONNEMENT) {
            buitenOfNiet = "buiten je bundel!";
        }
        System.out.printf("%-14s%5d%7.2f %20s\n", this.maand, this.hoeveelheidMb, kosten, buitenOfNiet);

    }

    public String getMaand() {
        return maand;
    }

    public int setHoeveelheidMb(int hoeveelheidMb) {
        return this.hoeveelheidMb = hoeveelheidMb;
    }
    
    public void berekenKosten() {
        this.kosten = BASIS_KOSTEN;
        if (this.hoeveelheidMb > VERBRUIK_ABONNEMENT) {
            this.kosten = BASIS_KOSTEN + ((this.hoeveelheidMb - VERBRUIK_ABONNEMENT) * MEERPRIJS_MB);
        }
    }
}
