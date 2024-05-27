//Mack Bakkum - 500721202

package controller;

import model.Klant;
import model.Verhuur;
import model.MotorBoot;
import model.ZeilBoot;

import java.time.LocalDate;

public class BotenVerhuurLauncher {
    public static void main(String[] args) {
        System.out.println("Mack Bakkum - 500721202");
        System.out.println();

        //Maakt de 3 boten aan die gegeven zijn in de opdracht.
        MotorBoot motorBoot1 = new MotorBoot("De Engel", 6, 12);
        ZeilBoot zeilBoot2 = new ZeilBoot("Valk 1", 18);
        MotorBoot motorBoot3 = new MotorBoot("SuzyQ", 12, 35);

        //Motorboot met negatieve lengte, krijgt hierdoor een error bericht.
        MotorBoot motorBootKort = new MotorBoot("Negatief", -2, 10);

        //Klant die geen vaarbewijs heeft probeert te huren.
        Klant magNietHuren = new Klant("Mag Niet Huren");
        Verhuur nietHurenVerhuur = new Verhuur(magNietHuren, LocalDate.parse("2020-12-10"), 1);
        nietHurenVerhuur.voegBootToe(motorBoot3);
        System.out.println();


        //Maak klant Van der Valk aan.
        Klant vdValk = new Klant("Van der Valk", "valk@vdvalk.nl", true);

        //Klant Van Der Valk huurt de 3 boten voor 7 dagen.
        Verhuur vdValkVerhuur = new Verhuur(vdValk, LocalDate.parse("2020-12-10"), 7);
        vdValkVerhuur.voegBootToe(motorBoot1);
        vdValkVerhuur.voegBootToe(motorBoot3);
        vdValkVerhuur.voegBootToe(zeilBoot2);

        //Print met overzicht van de verhuur.
        System.out.println(vdValkVerhuur);

    }
}
