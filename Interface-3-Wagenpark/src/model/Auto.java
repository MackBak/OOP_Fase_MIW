package model;

import java.time.LocalDate;

public class Auto implements Comparable<Auto> {

    private String merk;
    private String model;
    private LocalDate datumAfgifteKenteken;
    private int kilometerstand;
    private String kenteken;

    public Auto (String merk, String model, LocalDate datumAfgifteKenteken, int kilometerstand, String kenteken) {
        this.merk = merk;
        this.model = model;
        this.datumAfgifteKenteken = datumAfgifteKenteken;
        this.kilometerstand = kilometerstand;
        this.kenteken = kenteken;

    }

    public String toString() {
        StringBuilder sbAutoInfo = new StringBuilder();

        sbAutoInfo.append("Merk: ").append(this.merk).append("\n");
        sbAutoInfo.append("Model: ").append(this.model).append("\n");
        sbAutoInfo.append("Datum kenteken: ").append(this.datumAfgifteKenteken).append("\n");
        sbAutoInfo.append("Kilometerstand: ").append(this.kilometerstand).append("\n");
        sbAutoInfo.append("Kenteken: ").append(this.kenteken).append("\n");
        sbAutoInfo.append("\n");

        return sbAutoInfo.toString();
    }

    public LocalDate getDatumAfgifteKenteken() {
        return datumAfgifteKenteken;
    }

    @Override
    public int compareTo(Auto auto2) {
        return this.datumAfgifteKenteken.compareTo(auto2.datumAfgifteKenteken);
    }
}
