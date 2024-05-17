package Model;

public class Wedstrijd {

    String naamTegenstander;
    int voorDoelpunten;
    int tegenDoelpunten;

    public Wedstrijd() {
        this.naamTegenstander = "Onbekend";
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;
    }

    public Wedstrijd(String naamTegenstander) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;
    }

    public Wedstrijd(String naamTegenstander, int voorDoelpunten, int tegenDoelpunten) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;
    }

    public int bepaalWedstrijdPunten(int voorDoelpunten, int tegenDoelpunten) {
        int punten = 0;
        if (voorDoelpunten > tegenDoelpunten) {
            punten = 3;
        }
        if (voorDoelpunten < tegenDoelpunten) {
            punten = 0;
        }
        if (voorDoelpunten == tegenDoelpunten) {
            punten = 1;
        }
        return punten;
    }

    public String printUitslag() {
        String uitslag = "Uitslag van de wedstrijd tegen " + naamTegenstander + ": " + voorDoelpunten + " - " + tegenDoelpunten;
        return uitslag;
    }

    public String printWedstrijdPunten() {
        int punten = bepaalWedstrijdPunten(voorDoelpunten, tegenDoelpunten);
        String puntPrint;
        if (punten == 1) {
            puntPrint = "Dit levert " + punten + " wedstrijdpunt op.";
        } else {
            puntPrint = "Dit levert " + punten + " wedstrijdpunten op.";
        }
        return puntPrint;
    }

}
