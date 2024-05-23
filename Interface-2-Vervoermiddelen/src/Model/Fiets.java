package Model;

public class Fiets extends Voertuig {

    protected static int AANTAL_WIELEN = 2;

    public Fiets(String merk, String type, int gewicht) {
        super(merk, type, AANTAL_WIELEN, gewicht);
    }

    @Override
    public String geefAandrijfKracht() {
        return "menskracht ";
    }
    //geen get/set nodig want aantal wielen = protected.
}
