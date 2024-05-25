package model;

public class Kofferslot {

    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;

    public Kofferslot(Character eersteLetter, Character tweedeLetter, int cijfer) {
        setCombinatie(eersteLetter, tweedeLetter, cijfer);
    }

    public Kofferslot() {
        this('A', 'A', 0);
    }


    public void setCombinatie(Character EersteLetter, Character TweedeLetter, int cijfer) {
        this.setEersteLetter(EersteLetter);
        this.setTweedeLetter(TweedeLetter);
        this.setCijfer(cijfer);
    }


    public static char volgendeLetter(char letter) {
        char lowerCaseChar = Character.toLowerCase(letter);
        char nextChar = (char) (lowerCaseChar + 1);

        if (lowerCaseChar == 'z') {
            nextChar -= 26;
        }
        return Character.toUpperCase(nextChar);
    }


    public static int volgendeCijfer(int cijfer) {
        int nextNr = cijfer;

        if (nextNr < 9) {
            return nextNr + 1;
        } if (nextNr >= 9) {
            nextNr = 0;
        }
        return nextNr;
    }


    public void volgende() {
        cijfer = volgendeCijfer(cijfer);
        if (cijfer == 0) {
            tweedeLetter = volgendeLetter(tweedeLetter);
            if (tweedeLetter == 'A') {
                eersteLetter = volgendeLetter(eersteLetter);
            }
        }
    }


    public char getEersteLetter() {
        return eersteLetter;
    }

    public void setEersteLetter(char eersteLetter) {
        this.eersteLetter = eersteLetter;
    }

    public char getTweedeLetter() {
        return tweedeLetter;
    }

    public void setTweedeLetter(char tweedeLetter) {
        this.tweedeLetter = tweedeLetter;
    }

    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }
}
