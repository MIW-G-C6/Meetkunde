package model;

import java.util.ArrayList;
import java.util.Collections;

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
        if (figuur.pastInOppervlak(this.lengte, this.breedte)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur past niet.");
        }
    }

    @Override
    public String toString() {
        StringBuilder eenReturn = new StringBuilder();

        Collections.sort(mijnFiguren);
        for (Figuur figuur : mijnFiguren) {
            eenReturn.append(String.format("%s\n\n", figuur.toString()));
        }

        return eenReturn.toString();
    }

    public ArrayList<Figuur> getMijnFiguren() {
        return mijnFiguren;
    }
}
