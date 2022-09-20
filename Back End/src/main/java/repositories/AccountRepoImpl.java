package repositories;

import models.Account;
import utilities.JDBCConnection;
import utilities.HelperMethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountRepoImpl extends HelperMethods implements AccountRepo {


    public static Connection locConn = JDBCConnection.getConnection();

    @Override
    public Account addAccount(Account accObj) {

        String sqlQuery = "INSERT INTO Accounts VALUES (DEFAULT, ?, ?, ?);";

        try{
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);

            ps.setString(1, accObj.getAccName());
            ps.setString(2, accObj.getAccUUID());
            ps.setDouble(3, accObj.getAccBalance());

            ResultSet resSet = ps.executeQuery();

            if(resSet.next()) {
                return buildAccount(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Account getAccount(Account accObj) {

        String sqlQuery = "SELECT * FROM Accounts WHERE accUUID = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setString(1, accObj.getAccUUID());
            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildAccount(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    @Override
    public List<Account> getAllAccounts() {

        String sqlQuery = "SELECT * FROM Accounts;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ResultSet resSet = ps.executeQuery();
            List<Account> locList = new ArrayList<>();
            while(resSet.next()) {
                locList.add(buildAccount(resSet));
            }
            return locList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account updateAccount(Account accObj) {

        String sqlQuery =
                "UPDATE Accounts SET " +
                        "accId = ?, " +
                        "accName = ?, " +
                        "accUUID = ?, " +
                        "accBal = ?," +
                        "WHERE accUUID = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setInt(1, accObj.getAccId());
            ps.setString(2, accObj.getAccName());
            ps.setString(3, accObj.getAccUUID());
            ps.setDouble(4, accObj.getAccBalance());

            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildAccount(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Account deleteAccount(Account accObj) {

        String sqlQuery = "DELETE * FROM Accounts WHERE accUUID = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setString(1, accObj.getAccUUID());
            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildAccount(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    //Builder Helper
    private Account buildAccount(ResultSet resSet) throws SQLException {

        Account accObj = new Account();

        accObj.setAccId(resSet.getInt("accId"));
        accObj.setAccName(resSet.getString("accName"));
        accObj.setAccUUID(resSet.getString("accUUID"));
        accObj.setAccBalance(resSet.getDouble("accBal"));

        return accObj;
    }
}
