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
        Oppervlak oppervlak = new Oppervlak(50, 35);
        oppervlak.voegFiguurToe(new Rechthoek(4, 3, new Punt(0, 7), "rood"));
        oppervlak.voegFiguurToe(new Cirkel(4, new Punt(1.5, 1.5), "geel"));
        oppervlak.voegFiguurToe(new Rechthoek(9, 8, new Punt(3, 2), "groen"));
        oppervlak.voegFiguurToe(new Rechthoek(4, 1, new Punt(5, 7), "oranje"));
        oppervlak.voegFiguurToe(new Cirkel(2, new Punt(8, 5), "paars"));
        oppervlak.voegFiguurToe(new Rechthoek(11, 3, new Punt(5, 3), "blauw"));
        System.out.println(oppervlak);
    }

}
