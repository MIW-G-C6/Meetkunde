package controller;

import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Spelen met verschillende meetkundige figuren
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        System.out.println(Rechthoek.geefDefinitie());

        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];

        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2,5), "Blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);

        for (Rechthoek rechthoek : mijnRechthoekArray) {
            System.out.println(rechthoek.geefOmtrek());
            System.out.println(rechthoek.geefOppervlakte());
            System.out.println(rechthoek.getHoekpuntLinksBoven().getxCoordinaat());
            System.out.println(rechthoek.getHoekpuntLinksBoven().getyCoordinaat());
            System.out.println(rechthoek.vertelOverGrootte());
        }
    }

}
