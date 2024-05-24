package controller;

import model.Auto;
import model.Vestiging;

import java.time.LocalDate;
import java.util.ArrayList;

public class WagenparkLauncher {
    public static void main(String[] args) {

        // a. Tesla Model S 100D
        LocalDate teslaDatum = LocalDate.of(2019, 5, 5);
        Auto tesla = new Auto("Tesla", "Model S 100D", teslaDatum, 12646, "TR-264-X");
        // b. Dacia Logan MPV
        LocalDate daciaDatum = LocalDate.of(2017, 8, 16);
        Auto dacia = new Auto("Dacia", "Logan MPV", daciaDatum, 46367, "KS-567-W");
        // c. Toyota Prius
        LocalDate toyotaDatum = LocalDate.of(2015, 3, 2);
        Auto toyota = new Auto("Toyota", "Prius", toyotaDatum, 63234, "GG-111-K");

        Vestiging vestiging1 = new Vestiging("Goumere", "Albert Mol");
        vestiging1.voegAutoToe(tesla);
        vestiging1.voegAutoToe(dacia);
        vestiging1.voegAutoToe(toyota);

        System.out.println(vestiging1);


        ArrayList<Auto> autoNaDatum = vestiging1.geefAutosNaDatum(LocalDate.parse("2016-12-31"));
        System.out.println();
        for (Auto auto : autoNaDatum) {
            System.out.println(auto);
        }


    }
}
