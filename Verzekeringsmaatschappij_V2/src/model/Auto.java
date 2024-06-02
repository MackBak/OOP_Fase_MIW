// Mack Bakkum - 500721202

package model;

public class Auto {

    private String kenteken;
    private String merk;
    private String type;

    public Auto(String kenteken, String merk, String type) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.type = type;
    }

    public String toString() {
        return String.format("%s %s met kenteken %s\n", merk, type, kenteken);
    }

    public String getKenteken() {
        return kenteken;
    }
}
