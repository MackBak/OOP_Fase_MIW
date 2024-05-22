package controller;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOpdrachtLauncher {
    public static void main(String[] args) {

        // 1-  ArrayList met woorden aanmaken.
        ArrayList<String> woorden = new ArrayList<String>();
        woorden.add("Morgen");
        woorden.add("wordt");
        woorden.add("het");
        woorden.add("mooi");
        woorden.add("weer");

        for (int i = 0; i < woorden.size(); i++) {
            System.out.print(woorden.get(i) + " ");
        } //Test print om de woorden te zien.

        //"wordt" vervangen door "is".
        woorden.remove(1);
        woorden.add(1, "is");
        System.out.println();

        for (int i = 0; i < woorden.size(); i++) {
            System.out.print(woorden.get(i) + " ");
        }//Test print om de woorden weer te zien.


        //2 - ArrayList met random getallen genereren.
        ArrayList<Integer> randomLijst = maakRandomRijGetallen(10, 200);
        for (int i = 0; i < randomLijst.size(); i++) {
            System.out.println(randomLijst.get(i));
        }


        //3 - Som van rij methode testen.
        int som = somVanRij(randomLijst);
        System.out.println("Som van de getallen in de randomLijst:");
        System.out.println(som);


        //4 - Gemiddelde van rij methode testen
        double gemiddelde = gemiddeldeVanRij(randomLijst);
        System.out.println("Gemiddelde van randomLijst:");
        System.out.println(gemiddelde);


        //5 Lijst van getallen
        ArrayList<Number> getallen = new ArrayList<>();
        getallen.add(5);
        getallen.add(8);
        getallen.add(13);
        getallen.add(21);
        getallen.add(34);
        getallen.add(3.14);
        getallen.add(2.72);
        getallen.add(1.62);

        //5a Loop om alle gehele getallen te laten zien.
        for (int i = 0; i < getallen.size(); i++) {
            if (getallen.get(i) instanceof Integer) {
                System.out.println(getallen.get(i));
            }
        }

        //5b Som van gebroken getallen.
        double gebrokenSom = 0;
        for (int i = 0; i < getallen.size(); i++) {
            if (getallen.get(i) instanceof Double) {
                gebrokenSom = gebrokenSom + getallen.get(i).doubleValue();
            }
        }
        System.out.println("Som van gebroken getallen:");
        System.out.println(gebrokenSom);

        //5c Gemiddelde van lijst getallen
        double gemiddeldeLijst = gemiddeldeLijst(getallen);
        System.out.println("Gemiddelde uit lijst:");
        System.out.println(gemiddeldeLijst);


        //6 Zie opmerkingen onder de methodes.

    }//end of Main

    public static ArrayList<Integer> maakRandomRijGetallen(int aantal, int maximum) {
        ArrayList<Integer> getallen = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < aantal; i++) {
            int randomNumber = random.nextInt(maximum) + 1;
            getallen.add(randomNumber);
        }
        return getallen;
    }


    public static int somVanRij (ArrayList<Integer> rij) {
        int som = 0;
        for (int i = 0; i < rij.size(); i++) {
            som += rij.get(i);
        }
        return som;
    }


    public static double gemiddeldeVanRij (ArrayList<Integer> rij) {
        return somVanRij(rij) /(double) rij.size();
    }


    public static double gemiddeldeLijst (ArrayList<? extends Number> rij) {
        double lijstSom = 0;
        for (int i = 0; i < rij.size() ; i++) {
            lijstSom = lijstSom + rij.get(i).doubleValue();
        }
        double gemiddeldeLijst = lijstSom / rij.size();
        return gemiddeldeLijst;
    }
}


/* Opdracht 6 is uit te voeren in Vervoermiddelen.
Voeg onderstaande toe aan Main:

    ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("Tesla", "Model 3", 1611, "Elektrisch"));
        autos.add(new Auto("Volkswagen", "Golf", 1280, "Benzine"));
        autos.add(new Auto("Toyota", "Corolla", 1325, "Benzine"));
        autos.add(new Auto("Ford", "Mustang", 1681, "Benzine"));
        autos.add(new Auto("BMW", "3 Serie", 1425, "Diesel"));
        autos.add(new Auto("Mercedes-Benz", "C-Klasse", 1550, "Benzine"));
        autos.add(new Auto("Audi", "A4", 1495, "Diesel"));
        autos.add(new Auto("Volvo", "XC40", 1686, "Hybride"));

        double zwaarsteAuto = zwaarsteAuto(autos);
        System.out.println(zwaarsteAuto);

En de methode om de zwaarste auto te berekenen:

    public static double zwaarsteAuto (ArrayList<Auto> autos) {
        double zwaarsteAuto = 0;

        for (int i = 0; i < autos.size(); i++) {
            if (autos.get(i).getGewicht() > zwaarsteAuto) {
                zwaarsteAuto = autos.get(i).getGewicht();
            }
        }
        return zwaarsteAuto;
    }

 */
