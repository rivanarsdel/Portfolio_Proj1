package dev.riv.trms.models_dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrFormDTO {

    //Who is requesting
    private int trfId;
    private String empEmail; //foreign key maps many-to-one

    //What does it cover
    private String eventCovered;
    private long eventStartDate;
    private long eventEndDate;
    private double eventCost;
    private double trFormCost;

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
    private boolean eventIsPassed;
}
