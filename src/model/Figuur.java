package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Algemene eigenschappen die alle figuren moeten hebben
 */
public abstract class Figuur {
    protected static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    // Term DEFAULT WAARDE uit het klasse diagram voelt onnodig lang en staat niet in het woordenboek
    protected static final String DEFAULT_KLEUR = "Oranje";

    protected String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULT_KLEUR);
    }

    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten.";
    }

    public abstract double geefOmtrek();

    public abstract double geefOppervlakte();

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!";
        }
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s\nOmtrek: %.2f\nOppervlakte: %.2f",
                this.kleur, geefOmtrek(), geefOppervlakte());
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}
