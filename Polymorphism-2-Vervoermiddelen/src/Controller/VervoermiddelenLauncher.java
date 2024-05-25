package Controller;

import Model.Fiets;
import Model.Vervoermiddel;
import Model.Voertuig;
import Model.Koets;
import Model.Vaartuig;
import Model.Motorboot;
import Model.Zeilboot;
import Model.Auto;

public class VervoermiddelenLauncher {
    public static void main(String[] args) {

        int aantalVoertuigen = 5;
        Vervoermiddel[] vervoermiddelen = new Vervoermiddel[aantalVoertuigen];
        vervoermiddelen[0] = new Koets("Glinkowski", "Marathonwagen", 320, 2);
        vervoermiddelen[1] = new Auto("Dacia", "Logan MPV", 1150, "benzine");
        vervoermiddelen[2] = new Fiets("Koga Mijata", "Colmaro Race Ultegra", 9);
        vervoermiddelen[3] = new Zeilboot("Dufour 36", "Classic", 11.5);
        vervoermiddelen[4] = new Motorboot("Broesder", "Kotter", 13.75, "Diesel");
        
        for (int i = 0; i < aantalVoertuigen; i++) {
            System.out.println(vervoermiddelen[i]);
        }
    }
}
