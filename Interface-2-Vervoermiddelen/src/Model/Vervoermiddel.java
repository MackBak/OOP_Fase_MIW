package Model;

public abstract class Vervoermiddel {

    private int id;
    private static int aantalVervoermiddelen;
    private String merk;
    private String type;

    protected Vervoermiddel(String merk, String type) {
        this.aantalVervoermiddelen = aantalVervoermiddelen + 1;
        this.id = aantalVervoermiddelen;
        this.merk = merk;
        this.type = type;

    }

    public abstract String geefAandrijfKracht();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAantalVervoermiddelen() {
        return aantalVervoermiddelen;
    }

    public static void setAantalVervoermiddelen(int aantalVervoermiddelen) {
        Vervoermiddel.aantalVervoermiddelen = aantalVervoermiddelen;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Vervoermiddel #" + id + " " + merk + " " + type + " aangedreven door " + geefAandrijfKracht();
    }
}
