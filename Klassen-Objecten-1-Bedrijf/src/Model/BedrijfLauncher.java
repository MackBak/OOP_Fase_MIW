package Model;

public class BedrijfLauncher {
    public static void main(String[] args) {
        System.out.println(Persoon.aantalPersonen);
        Persoon baas = new Persoon("Mark", "Den Haag", 10000.0);

        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.personeelsNummer);

        Persoon medewerker = new Persoon("Caroline", "Delft", 4000.0);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.personeelsNummer);


        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);
        System.out.printf("%s verdient %.2f per jaar\n", baas.naam,
                baas.berekenjaarInkomen());
        System.out.printf("%s woont in %s\n", assistent.naam,
                assistent.woonplaats);
    }
}
