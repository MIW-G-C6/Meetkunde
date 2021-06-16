package controller;

import model.*;

import javax.security.sasl.SaslClient;
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

        Scanner keyboard = new Scanner(System.in);
        boolean juisteInvoer = false;

        while(!juisteInvoer) {
            System.out.print("Geef een straal: ");
            try {
                double straal = keyboard.nextDouble();
                Cirkel ingevoerdeCirkel = new Cirkel(straal);
                juisteInvoer = true;
                System.out.println(ingevoerdeCirkel);
            } catch (InputMismatchException fouteInvoer) {
                System.err.println("Dat was geen komma getal, probeer het nog een keer.");
                keyboard.nextLine();
            } catch (IllegalArgumentException fout) {
                System.err.println(fout.getMessage());
            } finally {
                System.out.println("Je invoer is op de juiste wijze afgehandeld.");
            }
        }

    }

}
