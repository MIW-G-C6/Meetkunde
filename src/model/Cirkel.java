package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Slaat de eigenschappen op van een cirkel
 */
public class Cirkel {
    public static int aantalCirkels = 0;

    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;
    public int volgnummer;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        this.straal = straal;
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
        this.volgnummer = ++aantalCirkels;
    }

    public Cirkel(double straal) {
        this.straal = straal;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "rood";
        this.volgnummer = ++aantalCirkels;
    }

    public Cirkel() {
        this.straal = 1;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "rood";
        this.volgnummer = ++aantalCirkels;
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public static String geefDefinitie() {
        int hallp = aantalCirkels;
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }
}
