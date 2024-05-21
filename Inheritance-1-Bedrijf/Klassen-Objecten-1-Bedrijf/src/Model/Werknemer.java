package Model;

public class Werknemer extends Persoon{

    private static double GRENSWAARDE_BONUS = 4500.00;
    private double maandSalaris;


    public Werknemer(String Naam, String woonplaats, Afdeling afdeling, Double maandSalaris) {
        super(Naam, woonplaats, afdeling);
        this.maandSalaris = maandSalaris;
    }

    public Werknemer(String Naam) {
        super(Naam);
    }

    public Werknemer() {

    }

    public boolean heeftRechtOpBonus() {
        if (getMaandSalaris() > GRENSWAARDE_BONUS) {
            return true;
        } else return false;
    }

    public double berekenJaarInkomen(){
        if (heeftRechtOpBonus()) {
            return getMaandSalaris() * 13;
        } else
        return getMaandSalaris() * 12;
    }

    public String toString(){
        if (getMaandSalaris() > GRENSWAARDE_BONUS) {
            return super.toString() + " en is een werknemer met recht op een bonus";
        } else
        return super.toString() + " en is een werknemer zonder recht op een bonus";
    }//nog if statement toevoegen

    public static double getGrenswaardeBonus() {
        return GRENSWAARDE_BONUS;
    }

    public static void setGrenswaardeBonus(double grenswaardeBonus) {
        GRENSWAARDE_BONUS = grenswaardeBonus;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris < 0.0) {
            System.out.println("Foutmelding: Bedrag moet positief zijn. We zetten het bedrag nu op 0.");
            this.maandSalaris = 0.0;
        } else
            this.maandSalaris = maandSalaris;
    }
}
