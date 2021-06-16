package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Slaat de eigenschappen op van een rechthoek
 */
public class Rechthoek extends Figuur {
    private static final int DEFAULT_LENGTE = 2;
    private static final int DEFAULT_BREEDTE = 1;

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        super(kleur);
        setLengte(lengte);
        setBreedte(breedte);
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), DEFAULT_KLEUR);
    }

    public Rechthoek() {
        this(DEFAULT_LENGTE, DEFAULT_BREEDTE);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return  getLengte() <= lengte &&
                getBreedte() <= breedte;
    }

    @Override
    public String toString() {
        return String.format("%s\nLengte: %.2f\nBreedte: %.2f\nHoekpunt: %s", super.toString(), this.lengte, this.breedte, this.hoekpuntLinksBoven);
    }

    public Punt getHoekpuntLinksBoven() {
        return hoekpuntLinksBoven;
    }

    public double getLengte() {
        return lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    private void setLengte(double lengte) {
        if (lengte <= 0) {
            throw new IllegalArgumentException("De lengte moet positief zijn");
        } else {
            this.lengte = lengte;
        }
    }

    private void setBreedte(double breedte) {
        if (breedte <= 0) {
            throw new IllegalArgumentException("De breedte moet positief zijn");
        } else {
            this.breedte = breedte;
        }
    }
}
