package controller;

import database.DBaccess;
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

        System.out.println("De verbinding is gemaakt!");
        String sql = "SELECT xcoordinaat, ycoordinaat FROM punt WHERE xcoordinaat = 3;";
        try {
            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                double xCoordinaat = resultSet.getDouble("xcoordinaat");
                double yCoordinaat = resultSet.getDouble("ycoordinaat");
                Punt punt = new Punt(xCoordinaat, yCoordinaat);
                System.out.println(punt);
            }
            dBaccess.closeConnection();
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
    }

}
