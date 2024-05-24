package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Vestiging {
    private String plaats;
    private String manager;
    private ArrayList<Auto> autos = new ArrayList<>();

    public Vestiging(String plaats, String manager) {
        this.plaats = plaats;
        this.manager = manager;
        autos = new ArrayList<>();
    }

    public void voegAutoToe(Auto auto) {
        autos.add(auto);

    }

    public ArrayList<Auto> geefAutosNaDatum(LocalDate datum) {
        ArrayList<Auto> autos = new ArrayList<>();
        for (Auto auto : this.autos) {
            if (auto.getDatumAfgifteKenteken().isAfter(datum)) {
                autos.add(auto);
            }
        }
        return autos;
    }

    public String toString() {
        Collections.sort(autos);
        StringBuilder sbVestiging = new StringBuilder();
        sbVestiging.append("Plaats: ").append(this.plaats).append("\n");
        sbVestiging.append("Manager: ").append(this.manager).append("\n");
        sbVestiging.append("\n");

        for (Auto auto : autos) {
            sbVestiging.append(auto);
        }

        return sbVestiging.toString();
    }

}
