package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Slaat de eigenschappen op van een cirkel
 */
public class Cirkel extends Figuur {
    private static final double DEFAULT_STRAAL = 1.0;

    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        this.setStraal(straal);
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULT_KLEUR);
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public String toString() {
        return String.format("%s\nStraal: %.2f\nMiddelpunt: %s",
                super.toString(), this.straal, this.middelpunt);
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.out.println("De straal moet positief zijn. De straal wordt nu op 1 gezet.");
            this.straal = DEFAULT_STRAAL;
        } else {
            this.straal = straal;
        }
    }

}
