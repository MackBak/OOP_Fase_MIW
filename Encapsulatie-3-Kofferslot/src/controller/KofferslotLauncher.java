package controller;

import model.Kofferslot;

public class KofferslotLauncher {
    public static void main(String[] args) {


        //Tests:

        //Test default constructor
        Kofferslot defaultSlot = new Kofferslot();
        System.out.println("Default constructor:");
        System.out.print(defaultSlot.getEersteLetter());
        System.out.print(defaultSlot.getTweedeLetter());
        System.out.println(defaultSlot.getCijfer());

        //Test all-args constructor.
        Kofferslot allArgsSlot = new Kofferslot('E', 'D', 8);
        System.out.println("All Args constructor:");
        System.out.print(allArgsSlot.getEersteLetter());
        System.out.print(allArgsSlot.getTweedeLetter());
        System.out.println(allArgsSlot.getCijfer());
        System.out.println();

        //AA0 to AA1
        Kofferslot slot1 = new Kofferslot('A', 'A', 1);
        slot1.volgende();
        System.out.print(slot1.getEersteLetter());
        System.out.print(slot1.getTweedeLetter());
        System.out.println(slot1.getCijfer());

        //BR9 to BS0
        Kofferslot slot2 = new Kofferslot('B', 'R', 9);
        slot2.volgende();
        System.out.print(slot2.getEersteLetter());
        System.out.print(slot2.getTweedeLetter());
        System.out.println(slot2.getCijfer());

        //DZ9 to EA0
        Kofferslot slot3 = new Kofferslot('D', 'Z', 9);
        slot3.volgende();
        System.out.print(slot3.getEersteLetter());
        System.out.print(slot3.getTweedeLetter());
        System.out.println(slot3.getCijfer());

        //ZZ9 to AA0
        Kofferslot slot4 = new Kofferslot('Z', 'Z', 9);
        slot4.volgende();
        System.out.print(slot4.getEersteLetter());
        System.out.print(slot4.getTweedeLetter());
        System.out.println(slot4.getCijfer());
    }
}
