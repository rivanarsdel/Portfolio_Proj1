package repositories;

import models.TrForm;
import utilities.JDBCConnection;
import utilities.HelperMethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrFormRepoImpl extends HelperMethods implements TrFormRepo {

    public static Connection locConn = JDBCConnection.getConnection();

    @Override
    public TrForm addTrForm(TrForm trfObj) {

        String sqlQuery = "INSERT INTO TrForms VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        int counter = 1; // Tracks parameter index

        try{
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);

            ps.setString(counter, trfObj.getEmpEmail()); counter++;
            ps.setString(counter, trfObj.getEventCovered()); counter++;
            ps.setLong(counter, trfObj.getEventStartDate()); counter++;
            ps.setLong(counter, trfObj.getEventEndDate()); counter++;
            ps.setDouble(counter, trfObj.getEventCost()); counter++;
            ps.setDouble(counter, trfObj.getTrCost()); counter++;
            ps.setInt(counter, trfObj.getTimeCommit()); counter++;
            ps.setLong(counter, trfObj.getSubmitDate()); counter++;
            ps.setLong(counter, trfObj.getDeadlineDate()); counter++;
            ps.setString(counter, trfObj.getJustification()); counter++;
            ps.setInt(counter, trfObj.getApprovalStage()); counter++;
            ps.setBoolean(counter, trfObj.isFlagged()); counter++;
            ps.setString(counter, trfObj.getFlagDesc()); counter++;
            ps.setString(counter, trfObj.getEventGrade()); counter++;
            ps.setBoolean(counter, trfObj.isEventPassed());


            ResultSet resSet = ps.executeQuery();

            if(resSet.next()) {
                return buildTrForm(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public TrForm getTrForm(TrForm trfObj) {

        String sqlQuery = "SELECT * FROM TrForms WHERE empEmail = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setString(1, trfObj.getEmpEmail());
            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildTrForm(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    @Override
    public List<TrForm> getAllTrForms() {

        String sqlQuery = "SELECT * FROM TrForms;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ResultSet resSet = ps.executeQuery();
            List<TrForm> locList = new ArrayList<>();
            while(resSet.next()) {
                locList.add(buildTrForm(resSet));
            }
            return locList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public TrForm updateTrForm(TrForm trfObj) {

        String sqlQuery =
                "UPDATE TrForms SET " +
                        "trfId = ?, " +
                        "empEmail = ?, " +
                        "eventCovered = ?, " +
                        "eventStartDate = ?, " +
                        "eventEndDate = ?, " +
                        "eventCost = ?, " +
                        "trCost = ?, " +
                        "timeCommit = ?, " +
                        "submitDate = ?, " +
                        "deadlineDate = ?, " +
                        "justification = ?, " +
                        "approvalStage = ?, " +
                        "flagged = ?, " +
                        "flagDesc = ?, " +
                        "eventGrade = ?, " +
                        "eventPassed = ?, " +
                        "WHERE empEmail = ?;";
        int counter = 1;

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);

            ps.setInt(counter, trfObj.getTrfId()); counter++;
            ps.setString(counter, trfObj.getEmpEmail()); counter++;
            ps.setString(counter, trfObj.getEventCovered()); counter++;
            ps.setLong(counter, trfObj.getEventStartDate()); counter++;
            ps.setLong(counter, trfObj.getEventEndDate()); counter++;
            ps.setDouble(counter, trfObj.getEventCost()); counter++;
            ps.setDouble(counter, trfObj.getTrCost()); counter++;
            ps.setInt(counter, trfObj.getTimeCommit()); counter++;
            ps.setLong(counter, trfObj.getSubmitDate()); counter++;
            ps.setLong(counter, trfObj.getDeadlineDate()); counter++;
            ps.setString(counter, trfObj.getJustification()); counter++;
            ps.setInt(counter, trfObj.getApprovalStage()); counter++;
            ps.setBoolean(counter, trfObj.isFlagged()); counter++;
            ps.setString(counter, trfObj.getFlagDesc()); counter++;
            ps.setString(counter, trfObj.getEventGrade()); counter++;
            ps.setBoolean(counter, trfObj.isEventPassed());

            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildTrForm(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public TrForm deleteTrForm(TrForm trfObj) {

        String sqlQuery = "DELETE * FROM TrForms WHERE empEmail = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setString(1, trfObj.getEmpEmail());
            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildTrForm(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
