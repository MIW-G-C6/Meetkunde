package controller;

import model.*;

import javax.security.sasl.SaslClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Spelen met verschillende meetkundige figuren
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<String> regelsUitHetBestand = new ArrayList<>();
        File rechthoekenBestand = new File("resources/Rechthoek.csv");
        try {
            Scanner invoerBestand = new Scanner(rechthoekenBestand);
            while (invoerBestand.hasNextLine()) {
                regelsUitHetBestand.add(invoerBestand.nextLine());
            }
            invoerBestand.close();
        } catch (FileNotFoundException nietGevonden) {
            System.out.println("Het bestand is niet gevonden.");
        }

        ArrayList<Rechthoek> rechthoeken = new ArrayList<>();
        for (String regelMetRechthoek : regelsUitHetBestand) {
            String[] regelArray = regelMetRechthoek.split(",");

            double lengte = Double.parseDouble(regelArray[0]);
            double breedte = Double.parseDouble(regelArray[1]);
            double xCoordinaat = Double.parseDouble(regelArray[2]);
            double yCoordinaat = Double.parseDouble(regelArray[3]);
            String kleur = regelArray[4];

            rechthoeken.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
        }

        for (Rechthoek rechthoek : rechthoeken) {
            System.out.println(rechthoek + "\n");
        }
    }

}
