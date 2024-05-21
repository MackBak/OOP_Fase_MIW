package controller;

import Model.ParkeerBoete;
import Model.SnelheidsBoete;
import Model.VerkeersBoete;

public class ParkeerBoeteLauncher {
    public static void main(String[] args) {

        VerkeersBoete boeteEen = new VerkeersBoete("Jan Smith", "ABC-ABC-1");
        boeteEen.setBedrag(250.0);
        System.out.println(boeteEen);

        ParkeerBoete boeteParkeer1 = new ParkeerBoete("Ali B", "ABC-ABC-2", 2);
        System.out.println(boeteParkeer1);

        SnelheidsBoete boeteSnelheid1 = new SnelheidsBoete("Lebron James", "ABC-ABC-3", 102, 80 );
        System.out.println(boeteSnelheid1);

    }
}
