package Controller;

import Model.*;

import java.util.ArrayList;

public class VervoermiddelenLauncher {
    public static void main(String[] args) {

        ArrayList<Vervoermiddel> vervoerArray = new ArrayList<>();
        vervoerArray.add(new Koets("Glinkowski", "Marathonwagen", 320, 2));
        vervoerArray.add(new Auto("Dacia", "Logan MPV", 1150, "Benzine"));
        vervoerArray.add(new Fiets("Koga Mijata", "Colmaro Race Ultegra", 9));
        vervoerArray.add(new Zeilboot("Dufour 36", "Classic", 11.5));
        vervoerArray.add(new Motorboot("Broesder", "Kotter", 13.75, "Diesel"));
        vervoerArray.add(new Auto("Tesla", "S 100D", 2200, "Elektrisch"));

        //3
        for (Vervoermiddel vervoermiddel : vervoerArray) {
            System.out.println(vervoermiddel);
            if (vervoermiddel instanceof Auto) {
                System.out.println(((Auto) vervoermiddel).getVervoerBelasting() + " euro belasting per kwartaal");
            }
            if (vervoermiddel instanceof Motorboot) {
                System.out.println(((Motorboot) vervoermiddel).getVervoerBelasting() + " euro belasting per kwartaal");
            }
        }
        System.out.println("-----");

        //4 - Lijst met alleen belastbare vervoermiddelen met belastingbedrag.
        for (Vervoermiddel vervoermiddel : vervoerArray) {
            if (vervoermiddel instanceof Belastbaar) {
                System.out.print(vervoermiddel);
                System.out.println(((Belastbaar) vervoermiddel).getVervoerBelasting() + " euro belasting per kwartaal");
            }
        }
        System.out.println("-----");

        //5 - Lijst met alleen onbelastbare vervoermiddelen.
        for (Vervoermiddel vervoermiddel : vervoerArray) {
            if (!(vervoermiddel instanceof Belastbaar)) {
                System.out.println(vervoermiddel);
            }
        }
    }

    public static double zwaarsteAuto(ArrayList<Auto> autos) {
        double zwaarsteAuto = 0;
        for (int i = 0; i < autos.size(); i++) {
            if (autos.get(i).getGewicht() > zwaarsteAuto) {
                zwaarsteAuto = autos.get(i).getGewicht();
            }
        }
        return zwaarsteAuto;
    }

}
