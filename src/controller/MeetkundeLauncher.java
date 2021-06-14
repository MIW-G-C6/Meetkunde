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
        System.out.println(Figuur.geefDefinitie());
        System.out.println(Cirkel.geefDefinitie());

        Cirkel[] mijnCirkelArray = new Cirkel[3];
        mijnCirkelArray[0] = new Cirkel(3, new Punt(1, 4), "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        for (int cirkel = 0; cirkel < mijnCirkelArray.length; cirkel++) {
            System.out.println(mijnCirkelArray[cirkel]);
            System.out.println(mijnCirkelArray[cirkel].vertelOverGrootte());;
        }

        System.out.println(Rechthoek.geefDefinitie());

        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];

        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "Blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);

        for (Rechthoek rechthoek : mijnRechthoekArray) {
            System.out.println(rechthoek);
            System.out.println(rechthoek.vertelOverGrootte());
        }
    }

}
