// Mack Bakkum - 500721202
//Een programma waarin verzekeringen worden behandeld.
//Je kan een WA verzekering aanmaken op een naam en een Auto verzekering aanmaken op een persoon & auto.
//Je kan ookeen Polis toevoegen aan een kantoor waar het wordt behandeld.

package controller;

import model.*;

import java.time.LocalDate;

public class VerzekeringsmaatschappijLauncher {
    public static void main(String[] args) {

        //Welkomstboodschap
        System.out.println("--- Mack Bakkum - 500721202 --- " + "\n");

        //Foutmelding bij fout ingevoerde eigen risico. Eerst auto aanmaken om deze toe te voegen.
        Auto auto1 = new Auto ("ABC-DE-01", "Volkswagen", "Polo");
        AutoPolis foutMeldingPolisRisico = new AutoPolis("Jan Smit", 5000, LocalDate.parse("2024-05-28"), 5, auto1, 5 );

        //Foutmelding bij te lage schadevrije jaren.
        AutoPolis foutMeldingPolisSchadeLaag = new AutoPolis("Jan Smit", 5000, LocalDate.parse("2024-05-28"), 2, auto1, -5 );

        //Foutmelding bij te hoge schadevrije jaren.
        AutoPolis foutMeldingPolisSchadeHoog = new AutoPolis("Jan Smit", 5000, LocalDate.parse("2024-05-28"), 2, auto1, 55 );
        System.out.println();

        //Auto aanmaken en WA + AutoPolis testprint van toString
        Auto auto2 = new Auto ("74-OBB-3", "Volkswagen", "Kever");
        WA_Polis testWA = new WA_Polis("Tom Poes", 100000, LocalDate.parse("2021-09-01"), 1, 4);
        AutoPolis testAP = new AutoPolis("Wammes Waggel", 10000, LocalDate.parse("2021-07-31"), 2, auto2, 8 );
        System.out.println(testWA + "\n");
        System.out.println(testAP + "\n");

        //Print toString van Verzekeringkantoor.
        Verzekeringskantoor kantoor1 = new Verzekeringskantoor("Bommelstein", "Rommeldam");
        kantoor1.voegPolisToe(testAP);
        System.out.println(kantoor1);
        }


}
