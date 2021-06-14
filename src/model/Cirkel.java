package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Slaat de eigenschappen op van een cirkel
 */
public class Cirkel {
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private static final double DEFAULT_STRAAL = 1.0;
    private static final double DEFAULT_MIDDELPUNT_X = 0.0;
    private static final double DEFAULT_MIDDELPUNT_Y = 0.0;
    private static final String DEFAULT_KLEUR = "rood";

    private double straal;
    private double middelpuntX;
    private double middelpuntY;
    private String kleur;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        this.setStraal(straal);
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.setKleur(kleur);
    }

    public Cirkel(double straal) {
        this(straal, DEFAULT_MIDDELPUNT_X, DEFAULT_MIDDELPUNT_Y, DEFAULT_KLEUR);
    }


    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!";
        }
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.out.println("De straal moet positief zijn. De straal wordt nu op 1 gezet.");
            this.straal = DEFAULT_STRAAL;
        } else {
            this.straal = straal;
        }
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }


}
