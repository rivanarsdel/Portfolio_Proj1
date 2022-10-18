package repositories;

import models.TrEvent;
import utilities.JDBCConnection;
import utilities.HelperMethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrEventRepoImpl extends HelperMethods implements TrEventRepo {

    public static Connection locConn = JDBCConnection.getConnection();

    @Override
    public TrEvent addTrEvent(TrEvent trfObj) {

        String sqlQuery = "INSERT INTO TrEvents VALUES (DEFAULT, ?, ?, ?);";

        try{
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);

            ps.setString(1, trfObj.getEventName());

            ResultSet resSet = ps.executeQuery();

            if(resSet.next()) {
                return buildTrEvent(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public TrEvent getTrEvent(TrEvent trfObj) {

        String sqlQuery = "SELECT * FROM TrEvents WHERE eventName = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setString(1, trfObj.getEventName());
            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildTrEvent(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    @Override
    public List<TrEvent> getAllTrEvents() {

        String sqlQuery = "SELECT * FROM TrEvents;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ResultSet resSet = ps.executeQuery();
            List<TrEvent> locList = new ArrayList<>();
            while(resSet.next()) {
                locList.add(buildTrEvent(resSet));
            }
            return locList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public TrEvent updateTrEvent(TrEvent trfObj) {

        String sqlQuery =
                "UPDATE TrEvents SET " +
                        "eventId = ?, " +
                        "eventName = ?, " +
                        "costModifier = ?, " +
                        "gradeScale = ?, " +
                        "WHERE eventName = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);

            ps.setInt(1, trfObj.getEventId());
            ps.setString(2, trfObj.getEventName());
            ps.setString(3, trfObj.getGradeScale());
            ps.setDouble(4, trfObj.getCostModifier());

            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildTrEvent(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public TrEvent deleteTrEvent(TrEvent trfObj) {

        String sqlQuery = "DELETE * FROM TrEvents WHERE eventName = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setString(1, trfObj.getEventName());
            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildTrEvent(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
