package Controller;

import java.util.Scanner;

public class VoetbalScoresLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Model.Wedstrijd eersteWedstrijd = new Model.Wedstrijd("PEC", 5, 0);

        System.out.println(eersteWedstrijd.printUitslag());
        System.out.println(eersteWedstrijd.printWedstrijdPunten());

        System.out.print("Wat is de tegenstander?");
        String tegenStander = scanner.nextLine();

        System.out.print("Doelpunten gescoord?:");
        int doelpunten = scanner.nextInt();

        System.out.print("Doelpunten tegenstander?:");
        int tegendoelpunten = scanner.nextInt();

        Model.Wedstrijd userWedstrijd = new Model.Wedstrijd(tegenStander, doelpunten, tegendoelpunten);
        System.out.println(userWedstrijd.printUitslag());
        System.out.println(userWedstrijd.printWedstrijdPunten());

    }
}
