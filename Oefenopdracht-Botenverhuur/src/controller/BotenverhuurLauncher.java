//Mack Bakkum - 500721202

package controller;

import java.time.LocalDate;

import model.Klant;
import model.MotorBoot;
import model.Verhuur;
import model.ZeilBoot;

public class BotenverhuurLauncher {
    public static void main(String[] args) {

        System.out.println("Uitwerking van Mack Bakkum - 500721202");
        System.out.println();

        Klant vanDerValk = new Klant("Van der Valk", "vdvalk@valk.com", true);
        MotorBoot motorboot1 = new MotorBoot("De Engel", 4, 15);
        ZeilBoot zeilboot2 = new ZeilBoot("Valk 1", 17);
        MotorBoot motorboot3 = new MotorBoot("SuzyQ", 12, 35);

        //Test voor de foutmelding i.v.m. een negatieve lengte boot.
        MotorBoot testLengteBoot = new MotorBoot("De Engel", -3, 15);
        System.out.println();
        System.out.println();

        //Test om te laten zien dat boot niet mag worden gehuurd.
        Klant klantZonderBewijs = new Klant ("Test Klant");
        Verhuur testVerhuur = new Verhuur(klantZonderBewijs, LocalDate.parse("2020-12-10"), 0);
        testVerhuur.voegBootToe(motorboot3);
        System.out.println();
        System.out.println();

        //Laatste print volgens opdracht.
        Verhuur vdValkVerhuur = new Verhuur(vanDerValk, LocalDate.parse("2020-12-10"), 7);
        vdValkVerhuur.voegBootToe(motorboot1);
        vdValkVerhuur.voegBootToe(motorboot3);
        vdValkVerhuur.voegBootToe(zeilboot2);
        System.out.println(vdValkVerhuur);

    }
}
