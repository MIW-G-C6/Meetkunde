package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Spelen met verschillende meetkundige figuren
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        System.out.println(Cirkel.geefDefinitie());

        Cirkel[] mijnCirkelArray = new Cirkel[3];
        mijnCirkelArray[0] = new Cirkel(3, 1, 4, "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        for (int cirkel = 0; cirkel < mijnCirkelArray.length; cirkel++) {
            System.out.println(mijnCirkelArray[cirkel].geefOmtrek());
            System.out.println(mijnCirkelArray[cirkel].geefOppervlakte());
            System.out.println(mijnCirkelArray[cirkel].vertelOverGrootte());
        }

        for (Cirkel cirkel : mijnCirkelArray) {
            System.out.println(cirkel.geefOmtrek());
            System.out.println(cirkel.geefOppervlakte());
            System.out.println(cirkel.vertelOverGrootte());
        }

    }

}
