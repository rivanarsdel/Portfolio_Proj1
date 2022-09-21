package utilities;

import models.Employee;
import models.ReimbursementForm;
import models.TuitionEvent;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HelperMethods {

    //<><><><><>-----Builder helpers to return Objects from SQL queries-----<><><><><>

    public TuitionEvent builtTuitionEvent(ResultSet rs) throws SQLException {

        TuitionEvent tevObj = new TuitionEvent();

        tevObj.setEventId(rs.getInt("eventId"));
        tevObj.setEventName(rs.getString("eventName"));
        tevObj.setCostModifier(rs.getDouble("costModifier"));
        tevObj.setGradeScale(rs.getString("gradeScale"));

        return tevObj;
    }
    public Employee buildEmployee(ResultSet rs) throws SQLException {

        Employee empObj = new Employee();

        empObj.setEmpID(rs.getInt("empId"));
        empObj.setFirstName(rs.getString("firstName"));
        empObj.setLastName(rs.getString("lastName"));
        empObj.setEmail(rs.getString("email"));
        empObj.setPassword(rs.getString("password"));
        empObj.setDepartment(rs.getString("department"));
        empObj.setDeptRole(rs.getString("deptRole"));
        empObj.setTrBalance(rs.getDouble("trBalance"));

        return empObj;
    }
    public ReimbursementForm buildTrForm(ResultSet rs) throws SQLException {

        ReimbursementForm trObj = new ReimbursementForm();


        trObj.setTrId(rs.getInt("trId"));
        trObj.setEmpEmail(rs.getString("empEmail"));

        trObj.setEventCovered(rs.getString("eventCovered"));
        trObj.setEventStartDate(rs.getLong("eventStartDate"));
        trObj.setEventEndDate(rs.getLong("eventEndDate"));
        trObj.setEventCost(rs.getDouble("eventCost"));
        trObj.setTrCost(rs.getDouble("trCost"));

        trObj.setTimeCommit(rs.getInt("timeCommit"));
        trObj.setSubmitDate(rs.getLong("submitDate"));
        trObj.setDeadlineDate(rs.getLong("deadlineDate"));

        trObj.setJustification(rs.getString("justification"));
        trObj.setApprovalStage(rs.getInt("approvalStage"));
        trObj.setFlagged(rs.getBoolean("flagged"));
        trObj.setFlagDesc(rs.getString("flagDesc"));

        trObj.setEventGrade(rs.getString("eventGrade"));
        trObj.setEventPassed(rs.getBoolean("eventPassed"));


        return trObj;
    }


}
