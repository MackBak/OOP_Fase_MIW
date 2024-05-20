// Mack Bakkum - 500721202


package Model;

public class Team {
    private String teamNaam;
    private int totaalWedstrijdPunten;
    private int totaalVoorDoelpunten;
    private int totaalTegenDoelpunten;

    public Team(String teamNaam, int totaalWedstrijdPunten, int totaalVoorDoelpunten, int totaalTegenDoelpunten) {
        this.teamNaam = teamNaam;
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
        this.totaalVoorDoelpunten = totaalVoorDoelpunten;
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }

    public Team(String teamNaam) {
        this(teamNaam, 0, 0, 0);
    }

    public Team() {
        this("");
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }

    public int getTotaalWedstrijdPunten() {
        return totaalWedstrijdPunten;
    }

    public void setTotaalWedstrijdPunten(int totaalWedstrijdPunten) {
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
    }

    public int getTotaalVoorDoelpunten() {
        return totaalVoorDoelpunten;
    }

    public void setTotaalVoorDoelpunten(int totaalVoorDoelpunten) {
        this.totaalVoorDoelpunten = totaalVoorDoelpunten;
    }

    public int getTotaalTegenDoelpunten() {
        return totaalTegenDoelpunten;
    }

    public void setTotaalTegenDoelpunten(int totaalTegenDoelpunten) {
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }

    public int getDoelSaldo() {
        //Reken op basis van totaalVoorDOelpunten & TotaalTegenDoelpunten het juiste doelsaldo uit
        return this.totaalVoorDoelpunten - this.totaalTegenDoelpunten;

    }

    public void printStatusTeam() {
        // Toon zin: “Het team NAC heeft 7 wedstrijdpunt(en) en een doelsaldo van 13”
        System.out.println("Het team " + this.teamNaam + " heeft " + this.totaalWedstrijdPunten + " wedstrijdpunt(en) en een doelsaldo van " + this.getDoelSaldo());
    }
}
