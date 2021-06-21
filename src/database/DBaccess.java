package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Maak tverbinding met de database
 */
public class DBaccess {
    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String PREFIX_CONNECTION_URL = "jdbc:mysql://localhost:3306/";
    private static final String CONNECTION_SETTINGS = "?useSSL=false" +
            "&allowPublicKeyRetrieval=true" +
            "&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false" +
            "&serverTimezone=UTC";
    private static final String SQL_EXCEPTION_PREFIX = "SQL Exception: ";

    private Connection connection;
    private String databaseName;
    private String mainUser;
    private String mainUserPassword;

    public DBaccess(String databaseName, String mainUser, String mainUserPassword) {
        this.databaseName = databaseName;
        this.mainUser = mainUser;
        this.mainUserPassword = mainUserPassword;
    }

    public void openConnection() {
        String connectionURL = PREFIX_CONNECTION_URL + databaseName + CONNECTION_SETTINGS;

        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(connectionURL, mainUser, mainUserPassword);
            System.out.println("Verbinding is gemaakt");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Driver niet gevonden");
        } catch (SQLException sqlException) {
            System.out.println("SQL Exception: " + sqlException.getMessage());
        }
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
