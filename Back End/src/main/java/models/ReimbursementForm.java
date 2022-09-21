package models;

import utilities.HelperMethods;

public class ReimbursementForm {

    //Who is requesting
    private int trId;
    private String empEmail; //foreign key maps many-to-one

    //What does it cover
    private String eventCovered;
    private long eventStartDate;
    private long eventEndDate;
    private double eventCost;
    private double trCost;

    //When is the event
    private int timeCommit;
    private long submitDate;
    private long deadlineDate;

    //Why does it matter
    private String justification;
    private int approvalStage;
    private boolean flagged;
    private String flagDesc; // All flag cases require description/justification

    //Final assessment
    private String eventGrade;
    private boolean eventPassed;


    //<><><><><>----------------------<><><><><>
    //<><><><><>-----Constructors-----<><><><><>
    //<><><><><>----------------------<><><><><>

    public ReimbursementForm() {}

    public ReimbursementForm(
            int trId,
            String eventCovered,
            long eventStartDate,
            long eventEndDate,
            double eventCost,
            int timeCommit,
            long submitDate,
            long deadlineDate,
            String justification,
            int approvalStage,
            boolean flagged,
            String flagDesc,
            String eventGrade,
            boolean eventPassed
    ) {
        this.trId = trId;
        this.eventCovered = eventCovered;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.eventCost = eventCost;
        this.trCost = trCost;
        this.timeCommit = timeCommit;
        this.submitDate = submitDate;
        this.deadlineDate = deadlineDate;
        this.justification = justification;
        this.approvalStage = approvalStage;
        this.flagged = flagged;
        this.flagDesc = flagDesc;
        this.eventGrade = eventGrade;
        this.eventPassed = eventPassed;
    }

    //<><><><><>-----------------------<><><><><>
    //<><><><><>-----Getter/Setter-----<><><><><>
    //<><><><><>-----------------------<><><><><>


    public double getTrCost() {return trCost;}

    public void setTrCost(double trCost) {this.trCost = trCost;}

    public int getTrId() {
        return trId;
    }

    public void setTrId(int trId) {
        this.trId = trId;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEventCovered() {
        return eventCovered;
    }

    public void setEventCovered(String eventCovered) {
        this.eventCovered = eventCovered;
    }

    public long getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(long eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public long getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(long eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public double getEventCost() {
        return eventCost;
    }

    public void setEventCost(double eventCost) {
        this.eventCost = eventCost;
    }

    public int getTimeCommit() {
        return timeCommit;
    }

    public void setTimeCommit(int timeCommit) {
        this.timeCommit = timeCommit;
    }

    public long getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(long submitDate) {
        this.submitDate = submitDate;
    }

    public long getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(long deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public int getApprovalStage() {
        return approvalStage;
    }

    public void setApprovalStage(int approvalStage) {
        this.approvalStage = approvalStage;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {this.flagged = flagged;}

    public String getFlagDesc() {
        return flagDesc;
    }

    public void setFlagDesc(String flagDesc) {
        this.flagDesc = flagDesc;
    }

    public String getEventGrade() {
        return eventGrade;
    }

    public void setEventGrade(String eventGrade) {
        this.eventGrade = eventGrade;
    }

    public boolean isEventPassed() {
        return eventPassed;
    }

    public void setEventPassed(boolean eventPassed) {
        this.eventPassed = eventPassed;
    }
}
