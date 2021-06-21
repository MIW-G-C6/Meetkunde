package controller;

import database.CirkelDAO;
import database.DBaccess;
import database.PuntDAO;
import model.*;

import java.sql.*;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Spelen met verschillende meetkundige figuren
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        String databaseName = "Figuren";
        String userName = "userFiguren";
        String mainUserPassword = "userFigurenPW";

        DBaccess dBaccess = new DBaccess(databaseName, userName, mainUserPassword);
        dBaccess.openConnection();

        PuntDAO puntDAO = new PuntDAO(dBaccess);

        for (Punt punt : puntDAO.getPunten()) {
            System.out.println(punt);
        }

        CirkelDAO cirkelDao = new CirkelDAO(dBaccess);
        cirkelDao.slaCirkelOp(new Cirkel(5, new Punt(3, 7), "Oranje"));

        dBaccess.closeConnection();
    }

}
