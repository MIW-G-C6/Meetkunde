package controller;

import model.*;

import javax.security.sasl.SaslClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Spelen met verschillende meetkundige figuren
 */
public class MeetkundeLauncher {
    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String PREFIX_CONNECTION_URL = "jdbc:mysql://localhost:3306/";
    private static final String CONNECTION_SETTINGS = "?useSSL=false" +
            "&allowPublicKeyRetrieval=true" +
            "&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false" +
            "&serverTimezone=UTC";

    public static void main(String[] args) {
        String databaseName = "Figuren";
        String userName = "userFiguren";
        String mainUserPassword = "userFigurenPW";

        String connectionURL = PREFIX_CONNECTION_URL + databaseName + CONNECTION_SETTINGS;
        Connection connection = null;

        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(connectionURL, userName, mainUserPassword);
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Driver niet gevonden");
        } catch (SQLException sqlException) {
            System.out.println("SQL Exception: " + sqlException.getMessage());
        }

        if (connection == null) {
            throw new IllegalArgumentException("Je hebt me gestart maar de randvoorwaarden kloppen niet, " +
                    "ik kan zo niet verder.");
        }

        System.out.println("De verbinding is gemaakt!");
        String sql = "SELECT xcoordinaat, ycoordinaat FROM punt;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                double xCoordinaat = resultSet.getDouble("xcoordinaat");
                double yCoordinaat = resultSet.getDouble("ycoordinaat");
                Punt punt = new Punt(xCoordinaat, yCoordinaat);
                System.out.println(punt);
            }
            connection.close();
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
    }

}
