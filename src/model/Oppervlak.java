package model;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> mijnFiguren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        mijnFiguren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuurPastAlsVormInOppervlak(figuur)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur is te groot");
        }

    }

    public boolean figuurPastAlsVormInOppervlak(Figuur figuur) {
        boolean past = false;

        if (figuur instanceof Rechthoek) {
            if (    ((Rechthoek) figuur).getLengte() <= this.lengte &&
                    ((Rechthoek) figuur).getBreedte() <= this.breedte ) {
                past = true;
            }
        } else if (figuur instanceof Cirkel) {
            if (    ((Cirkel) figuur).getStraal() * 2 <= this.breedte &&
                    ((Cirkel) figuur).getStraal() * 2 <= this.lengte) {
                past = true;
            }
        }

        return past;
    }

    public ArrayList<Figuur> geefFigurenMetGrotereOppervlakteDan(double grenswaarde) {
        ArrayList<Figuur> gevraagdeFiguren = new ArrayList<>();

        for (Figuur figuur : mijnFiguren) {
            if (figuur.geefOppervlakte() > grenswaarde) {
                gevraagdeFiguren.add(figuur);
            }
        }

        return gevraagdeFiguren;
    }

    @Override
    public String toString() {
        String eenReturn = "";

        for (Figuur figuur : mijnFiguren) {
            eenReturn += figuur.toString() + "\n\n";
        }

        return eenReturn;
    }

    public ArrayList<Figuur> getMijnFiguren() {
        return mijnFiguren;
    }
}
