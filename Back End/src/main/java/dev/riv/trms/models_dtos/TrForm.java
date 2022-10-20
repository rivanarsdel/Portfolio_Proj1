package dev.riv.trms.models_dtos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "trForms")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "trfId")
public class TrForm {

    //Who is requesting
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trfId")
    private int trfId;
    @Column(name = "empEmail", unique = true)
    @NotNull
    private String empEmail; //foreign key maps many-to-one

    //What does it cover
    @Column(name =  "eventCovered")
    private String eventCovered;
    @Column(name =  "eventStartDate")
    private long eventStartDate;
    @Column(name =  "eventEndDate")
    private long eventEndDate;
    @Column(name =  "eventCost")
    private double eventCost;
    @Column(name =  "trFormCost")
    private double trFormCost;

    //When is the event
    @Column(name =  "timeCommit")
    private int timeCommit;
    @Column(name =  "submitDate")
    private long submitDate;
    @Column(name =  "deadlineDate")
    private long deadlineDate;

    //Why does it matter
    @Column(name =  "justification")
    private String justification;
    @Column(name =  "approvalStage")
    private int approvalStage;
    @Column(name =  "flagged")
    private boolean flagged;
    @Column(name =  "flagDesc")
    private String flagDesc; // All flag cases require description/justification

    //Final assessment
    @Column(name =  "eventGrade")
    private String eventGrade;
    @Column(name =  "eventIsPassed")
    private boolean eventIsPassed;


    //<><><><><>----------------------<><><><><>
    //<><><><><>-----Constructors-----<><><><><>
    //<><><><><>----------------------<><><><><>

//    public TrForm() {}
//
//    public TrForm(
//            int trfId,
//            String eventCovered,
//            long eventStartDate,
//            long eventEndDate,
//            double eventCost,
//            int timeCommit,
//            long submitDate,
//            long deadlineDate,
//            String justification,
//            int approvalStage,
//            boolean flagged,
//            String flagDesc,
//            String eventGrade,
//            boolean eventPassed
//    ) {
//        this.trfId = trfId;
//        this.eventCovered = eventCovered;
//        this.eventStartDate = eventStartDate;
//        this.eventEndDate = eventEndDate;
//        this.eventCost = eventCost;
//        this.trCost = trCost;
//        this.timeCommit = timeCommit;
//        this.submitDate = submitDate;
//        this.deadlineDate = deadlineDate;
//        this.justification = justification;
//        this.approvalStage = approvalStage;
//        this.flagged = flagged;
//        this.flagDesc = flagDesc;
//        this.eventGrade = eventGrade;
//        this.eventPassed = eventPassed;
//    }

    //<><><><><>-----------------------<><><><><>
    //<><><><><>-----Getter/Setter-----<><><><><>
    //<><><><><>-----------------------<><><><><>


//    public double getTrCost() {return trCost;}
//
//    public void setTrCost(double trCost) {this.trCost = trCost;}
//
//    public int getTrfId() {
//        return trfId;
//    }
//
//    public void setTrfId(int trfId) {
//        this.trfId = trfId;
//    }
//
//    public String getEmpEmail() {
//        return empEmail;
//    }
//
//    public void setEmpEmail(String empEmail) {
//        this.empEmail = empEmail;
//    }
//
//    public String getEventCovered() {
//        return eventCovered;
//    }
//
//    public void setEventCovered(String eventCovered) {
//        this.eventCovered = eventCovered;
//    }
//
//    public long getEventStartDate() {
//        return eventStartDate;
//    }
//
//    public void setEventStartDate(long eventStartDate) {
//        this.eventStartDate = eventStartDate;
//    }
//
//    public long getEventEndDate() {
//        return eventEndDate;
//    }
//
//    public void setEventEndDate(long eventEndDate) {
//        this.eventEndDate = eventEndDate;
//    }
//
//    public double getEventCost() {
//        return eventCost;
//    }
//
//    public void setEventCost(double eventCost) {
//        this.eventCost = eventCost;
//    }
//
//    public int getTimeCommit() {
//        return timeCommit;
//    }
//
//    public void setTimeCommit(int timeCommit) {
//        this.timeCommit = timeCommit;
//    }
//
//    public long getSubmitDate() {
//        return submitDate;
//    }
//
//    public void setSubmitDate(long submitDate) {
//        this.submitDate = submitDate;
//    }
//
//    public long getDeadlineDate() {
//        return deadlineDate;
//    }
//
//    public void setDeadlineDate(long deadlineDate) {
//        this.deadlineDate = deadlineDate;
//    }
//
//    public String getJustification() {
//        return justification;
//    }
//
//    public void setJustification(String justification) {
//        this.justification = justification;
//    }
//
//    public int getApprovalStage() {
//        return approvalStage;
//    }
//
//    public void setApprovalStage(int approvalStage) {
//        this.approvalStage = approvalStage;
//    }
//
//    public boolean isFlagged() {
//        return flagged;
//    }
//
//    public void setFlagged(boolean flagged) {this.flagged = flagged;}
//
//    public String getFlagDesc() {
//        return flagDesc;
//    }
//
//    public void setFlagDesc(String flagDesc) {
//        this.flagDesc = flagDesc;
//    }
//
//    public String getEventGrade() {
//        return eventGrade;
//    }
//
//    public void setEventGrade(String eventGrade) {
//        this.eventGrade = eventGrade;
//    }
//
//    public boolean isEventPassed() {
//        return eventPassed;
//    }
//
//    public void setEventPassed(boolean eventPassed) {
//        this.eventPassed = eventPassed;
//    }
}
