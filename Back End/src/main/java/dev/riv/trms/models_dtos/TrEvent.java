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
@Table(name = "employees")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "trEventId")
public class TrEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trEventId", nullable = false)
    private int trEventId;

    @Column(name = "trEvName", unique = true)
    @NotNull
    private String trEvName;

    @Column(name  = "costModifier")
    @NotNull
    private double costModifier;

    @Column(name = "gradeScale")
    @NotNull
    private String gradeScale;


    //<><><><><>-----------------------------<><><><><>
    //<><><><><>---------Constructor---------<><><><><>
    //<><><><><>-----------------------------<><><><><>

//    public TrEvent() {}
//
//    public TrEvent(int eventId, String eventName, double costModifier, String gradeScale) {
//        this.eventId = eventId;
//        this.eventName = eventName;
//        this.costModifier = costModifier;
//        this.gradeScale = gradeScale;
//    }

    //<><><><><>-----------------------------<><><><><>
    //<><><><><>-----Getters and Setters-----<><><><><>
    //<><><><><>-----------------------------<><><><><>
//
//
//    public int getEventId() {return eventId;}
//
//    public void setEventId(int eventId) {this.eventId = eventId;}
//
//    public String getEventName() {return eventName;}
//
//    public void setEventName(String eventName) {this.eventName = eventName;}
//
//    public double getCostModifier() {return costModifier;}
//
//    public void setCostModifier(double costModifier) {this.costModifier = costModifier;}
//
//    public String getGradeScale() {return gradeScale;}
//
//    public void setGradeScale(String gradeScale) {this.gradeScale = gradeScale;}
}
