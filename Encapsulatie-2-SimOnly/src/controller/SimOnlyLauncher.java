package controller;

import model.Verbruik;

import java.util.Scanner;

public class SimOnlyLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Verbruik augustusVerbruik = new Verbruik("Augustus", 4563);
        Verbruik oktoberVerbruik = new Verbruik("Oktober", 2134);

        int aantalMaanden = 4;
        Verbruik[] maanden = new Verbruik[aantalMaanden];
        maanden[0] = new Verbruik("Juli");
        maanden[1] = new Verbruik("Augustus");
        maanden[2] = new Verbruik("September");
        maanden[3] = new Verbruik("Oktober");

        for (int i = 0; i < aantalMaanden; i++) {
            System.out.println("Geef je dataverbruik in MB per maand:");
            System.out.print(maanden[i].getMaand() + ": ");
            maanden[i].setHoeveelheidMb(scanner.nextInt());
        }//end of for loop to set data

        for (int i = 0; i < aantalMaanden; i++) {
            maanden[i].berekenKosten();
        }

        for (int i = 0; i < aantalMaanden; i++) {
            maanden[i].toonVerbruik();
        }
    }
}
