package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Spelen met verschillende meetkundige figuren
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel mijnCirkel = new Cirkel(3, new Punt(2, 5), "Groen");
        Rechthoek mijnRechthoek = new Rechthoek(3, 4, new Punt(-2, 6), "Blauw");

        Figuur[] figuren = new Figuur[3];
        figuren[0] = mijnCirkel;
        figuren[1] = mijnRechthoek;
        figuren[2] = new Cirkel(10, new Punt(-1, -3), "Karmozijn");

        for (Figuur figuur : figuren) {
            toonInformatie(figuur);
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }

}
