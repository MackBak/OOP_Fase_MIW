package Controller;

import Model.Score;
import Model.Vak;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        final double MAX_PUNTEN = 28;
        final double BSA_PERCENTAGE = 5 / 6.0;
        final double MIN_CIJFER = 1.0;
        final double MAX_CIJFER = 10.0;
        int puntenTotaal = 0;

        Scanner scanner = new Scanner(System.in);

        int aantalVakken = 7;
        Vak[] vakken = new Vak[aantalVakken];
        vakken[0] = new Vak("Fasten Your Seatbelts", 12, 5.5);
        vakken[1] = new Vak("Programming", 3, 5.5);
        vakken[2] = new Vak("Databases", 3, 5.5);
        vakken[3] = new Vak("Personal Skills", 2, 5.5);
        vakken[4] = new Vak("Project Skills", 2, 5.5);
        vakken[5] = new Vak("OOP1", 3, 5.5);
        vakken[6] = new Vak("User Interaction", 3, 5.5);

        int aantalScores = 7;
        Score[] scores = new Score[aantalScores];

        System.out.println("Voer je behaalde cijfers in:");
        for (int i = 0; i < aantalScores; i++) {
            double userCijfer;
            do {
                System.out.print(vakken[i].getNaam() + ":");
                userCijfer = scanner.nextDouble();
                if (userCijfer > MAX_CIJFER || userCijfer < MIN_CIJFER) {
                    System.out.println("Vul cijfer in tussen" + MIN_CIJFER + " en " + MAX_CIJFER);
                }
            } while (userCijfer > MAX_CIJFER || userCijfer < MIN_CIJFER);

            scores[i] = new Score(vakken[i], userCijfer);
        }


        for (int i = 0; i < aantalScores; i++) {
            System.out.printf("Vak/Project: %-30s Cijfer: %-4.1f Behaalde punten: %-3d\n", (scores[i].getVak().getNaam()), scores[i].getCijfer(), scores[i].getBehaaldePunten());
            puntenTotaal = puntenTotaal + scores[i].getBehaaldePunten();
        }


        System.out.println("Totaal behaalde studiepunten: " + puntenTotaal + "/" + MAX_PUNTEN);
        if (puntenTotaal < BSA_PERCENTAGE * MAX_PUNTEN) {
            System.out.println("PAS OP: Je ligt op schema voor een negatief BSA!");
        }
    }
}
