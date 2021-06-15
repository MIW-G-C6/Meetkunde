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
        mijnFiguren.add(figuur);
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
