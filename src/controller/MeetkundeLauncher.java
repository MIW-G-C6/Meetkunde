package controller;

import model.*;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Scanner;

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

        ArrayList<Cirkel> mijnCirkels = new ArrayList<>();
        mijnCirkels.add(new Cirkel(3, new Punt(1, 4), "Groen"));
        mijnCirkels.add(new Cirkel());
        mijnCirkels.add(new Cirkel(6));

        for (int i = 0; i < mijnCirkels.size(); i++) {
            System.out.println(mijnCirkels.get(i));
        }

        Oppervlak oppervlak = new Oppervlak(10, 7);
        oppervlak.voegFiguurToe(new Rechthoek(3, 3, new Punt(0, 7), "rood"));
        oppervlak.voegFiguurToe(new Rechthoek(3, 2, new Punt(0, 4), "geel"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 2, new Punt(0, 2), "groen"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 2, new Punt(3, 7), "paars"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 4, new Punt(5, 7), "oranje"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 3, new Punt(5, 3), "blauw"));

        toonInformatieAlleFiguren(oppervlak.geefFigurenMetGrotereOppervlakteDan(25));

        Oppervlak oppervlak2 = new Oppervlak(10, 7);
        oppervlak2.voegFiguurToe(new Rechthoek(4, 3, new Punt(0, 7), "rood"));
        oppervlak2.voegFiguurToe(new Cirkel(4, new Punt(1.5, 1.5), "geel"));
        oppervlak2.voegFiguurToe(new Rechthoek(9, 8, new Punt(3, 2), "groen"));
        oppervlak2.voegFiguurToe(new Rechthoek(4, 1, new Punt(5, 7), "oranje"));
        oppervlak2.voegFiguurToe(new Cirkel(2, new Punt(8, 5), "paars"));
        oppervlak2.voegFiguurToe(new Rechthoek(11, 3, new Punt(5, 3), "blauw"));

    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }

    public static void toonInformatieAlleFiguren(ArrayList<Figuur> figuren) {
        for (Figuur figuur : figuren) {
            toonInformatie(figuur);
        }
    }

}
