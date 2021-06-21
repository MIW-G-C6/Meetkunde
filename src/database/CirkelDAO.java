package database;

import model.Cirkel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Leest en schrijft cirkels van en naar de database
 */
public class CirkelDAO extends AbstractDAO {

    public CirkelDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaCirkelOp(Cirkel cirkel) {
        String sql = "INSERT INTO figuur(kleur) VALUES (?);";
        int primaryKey = 0;
        try {
            setupPreparedStatementWithKey(sql);
            preparedStatement.setString(1, cirkel.getKleur());
            primaryKey = executeInsertStatementWithKey();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        String sql2 = "INSERT INTO cirkel VALUES(?, ?, ? ,?);";
        try {
            setupPreparedStatement(sql2);
            preparedStatement.setInt(1, primaryKey);
            preparedStatement.setDouble(2, cirkel.getStraal());
            preparedStatement.setDouble(3, cirkel.getMiddelpunt().getxCoordinaat());
            preparedStatement.setDouble(4, cirkel.getMiddelpunt().getyCoordinaat());
            executeManipulateStatement();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
