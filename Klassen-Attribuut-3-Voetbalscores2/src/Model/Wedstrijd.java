//// Mack Bakkum - 500721202

package Model;

public class Wedstrijd {
    private Team thuisTeam;
    private Team uitTeam;
    private int thuisDoelpunten;
    private int uitDoelpunten;
    static final int WIN_PUNTEN = 3;
    static final int VERL_PUNTEN = 0;
    static final int GELIJK_PUNTEN = 1;

    public Wedstrijd(Team thuisTeam, Team uitTeam, int thuisDoelpunten, int uitDoelpunten) {
        this.thuisTeam = thuisTeam;
        this.uitTeam = uitTeam;
        this.thuisDoelpunten = thuisDoelpunten;
        this.uitDoelpunten = uitDoelpunten;
    }

    public Wedstrijd(Team thuisTeam, Team uitTeam) {
        this.thuisTeam = thuisTeam;
        this.uitTeam = uitTeam;
    }

    public Wedstrijd() {

    }

    public Team getThuisTeam() {
        return thuisTeam;
    }

    public void setThuisTeam(Team thuisTeam) {
        this.thuisTeam = thuisTeam;
    }

    public Team getUitTeam() {
        return uitTeam;
    }

    public void setUitTeam(Team uitTeam) {
        this.uitTeam = uitTeam;
    }

    public int getThuisDoelpunten() {
        return thuisDoelpunten;
    }

    public void setThuisDoelpunten(int thuisDoelpunten) {
        this.thuisDoelpunten = thuisDoelpunten;
    }

    public int getUitDoelpunten() {
        return uitDoelpunten;
    }

    public void setUitDoelpunten(int uitDoelpunten) {
        this.uitDoelpunten = uitDoelpunten;
    }

    public int getWedstrijdPuntenThuisTeam() {
        if (this.thuisDoelpunten > this.uitDoelpunten) {
            return WIN_PUNTEN;
        }
        if (this.thuisDoelpunten == this.uitDoelpunten) {
            return GELIJK_PUNTEN;
        } else {
            return VERL_PUNTEN;
        }
    }

    public int getWedstrijdPuntenUitTeam() {
        if (this.thuisDoelpunten > this.uitDoelpunten) {
            return VERL_PUNTEN;
        }
        if (this.thuisDoelpunten == this.uitDoelpunten) {
            return GELIJK_PUNTEN;
        } else {
            return WIN_PUNTEN;
        }
    }

    public void setWedstrijdPuntenThuisTeam() {
        int thuisSetPunten = thuisTeam.getTotaalWedstrijdPunten();
        this.thuisTeam.setTotaalWedstrijdPunten(getWedstrijdPuntenThuisTeam() + thuisSetPunten);
    }

    public void setWedstrijdPuntenUitTeam() {
        int uitSetPunten = uitTeam.getTotaalWedstrijdPunten();
        this.uitTeam.setTotaalWedstrijdPunten(getWedstrijdPuntenUitTeam() + uitSetPunten);
    }

    public void setTotaalDoelpuntenTeams() {
        //f. Maak een methode setTotaalDoelpuntenTeams() die voor beide teams op basis van de uitslag de doelpunten voor en de doelpunten tegen aanpast. Let wel: het gaat om 4 aanpassingen!
        int totaalVoorDoelPuntThuis = thuisTeam.getTotaalVoorDoelpunten();
        totaalVoorDoelPuntThuis += this.thuisDoelpunten;
        thuisTeam.setTotaalVoorDoelpunten(totaalVoorDoelPuntThuis);

        int totaalTegenDoelpuntThuis = thuisTeam.getTotaalTegenDoelpunten();
        totaalTegenDoelpuntThuis += this.uitDoelpunten;
        thuisTeam.setTotaalTegenDoelpunten(totaalTegenDoelpuntThuis);

        int totaalVoorDoelpuntUit = uitTeam.getTotaalVoorDoelpunten();
        totaalVoorDoelpuntUit += this.uitDoelpunten;
        uitTeam.setTotaalVoorDoelpunten(totaalVoorDoelpuntUit);

        int totaalTegenDoelpuntUit = uitTeam.getTotaalTegenDoelpunten();
        totaalTegenDoelpuntUit += this.thuisDoelpunten;
        uitTeam.setTotaalTegenDoelpunten(totaalTegenDoelpuntUit);
    }

    public void printUitslag() {
        System.out.println("Uitslag van de wedstrijd " + thuisTeam.getTeamNaam() + " - " + uitTeam.getTeamNaam() + ": " + this.thuisDoelpunten + "-" + this.uitDoelpunten);
    }

    public void printWedstrijdPunten() {
        System.out.println("Dit levert " + getWedstrijdPuntenThuisTeam() + " wedstrijdpunten op voor " + thuisTeam.getTeamNaam() + " en " + getWedstrijdPuntenUitTeam() + " wedstrijdpunten voor " + uitTeam.getTeamNaam() + ".");
    }

    public int getAantalWedstrijden(int hoeveelheidTeams) {
        return hoeveelheidTeams * (hoeveelheidTeams - 1);
    }

}//end of class


/* To do:
Constructor chaining
 */