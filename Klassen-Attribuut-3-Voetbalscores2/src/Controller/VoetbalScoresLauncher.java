// Mack Bakkum - 500721202

package Controller;

import Model.Team;
import Model.Wedstrijd;

import java.util.Scanner;

public class VoetbalScoresLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoeveel teams?:");
        int aantalTeams = scanner.nextInt();
        Team[] teams = new Team[aantalTeams];

        System.out.println("Geef de namen van de teams:");
        for (int i = 0; i < aantalTeams; i++) {
            System.out.println("Team " + (i + 1) + ": ");
            teams[i] = new Team(scanner.next());
        }

        int aantalWedstrijden = aantalTeams * (aantalTeams - 1);
        Wedstrijd[] wedstrijden = new Wedstrijd[aantalWedstrijden];

        int teller = 0;
        for (int i = 0; i < aantalTeams - 1; i++) {
            for (int j = i + 1; j < aantalTeams; j++) {
                wedstrijden[teller] = new Wedstrijd(teams[i], teams[j]);
                teller++;
            }
        }//end of thuiswedstrijden

        for (int i = 0; i < aantalTeams - 1; i++) {
            for (int j = i + 1; j < aantalTeams; j++) {
                wedstrijden[teller] = new Wedstrijd(teams[j], teams[i]);
                teller++;
            }
        }//end of uitwedstrijden

        for (int i = 0; i < aantalWedstrijden; i++) {
            System.out.print("Geef van de wedstrijd " + wedstrijden[i].getThuisTeam().getTeamNaam() + "-" + wedstrijden[i].getUitTeam().getTeamNaam() + " de thuisdoelpunten: ");
            wedstrijden[i].setThuisDoelpunten(scanner.nextInt());
            System.out.print("Geef van de wedstrijd " + wedstrijden[i].getThuisTeam().getTeamNaam() + "-" + wedstrijden[i].getUitTeam().getTeamNaam() + " de uitdoelpunten: ");
            wedstrijden[i].setUitDoelpunten(scanner.nextInt());
        }//end of user input

        for (int i = 0; i < aantalWedstrijden; i++) {
            wedstrijden[i].printUitslag();
            wedstrijden[i].setWedstrijdPuntenThuisTeam();
            wedstrijden[i].setWedstrijdPuntenUitTeam();
            wedstrijden[i].setTotaalDoelpuntenTeams();
        }//End of for loop to print results and update wedstrijdpunten.

        for (int i = 0; i < aantalTeams; i++) {
            teams[i].printStatusTeam();
        }// end of for loop to print GF/GA.
    }
}
